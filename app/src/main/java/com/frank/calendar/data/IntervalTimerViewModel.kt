package com.frank.calendar.data

import android.app.DatePickerDialog
import android.content.Context
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import com.frank.calendar.LunarCalendar
import com.frank.calendar.MainActivity
import com.frank.calendar.util.ObservableViewModel
import com.frank.calendar.util.Timer
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.TimerTask
import java.util.concurrent.TimeUnit

class IntervalTimerViewModel(private val timer: Timer) : ObservableViewModel() {

    val currentTime = ObservableField<String>()
    val currentDate = ObservableField<String>()
    val nongliDate = ObservableField<String>()
    var newCurrentDate: Int = -1
    var currentDateNum: Int = -1
    val dateColor = ObservableBoolean(true)
    val toDate: Calendar = Calendar.getInstance()

    protected lateinit var context: Context
    fun addContext(context: MainActivity) {
        this.context = context
    }

    /**
     * Resets timers and state. Called from the UI.
     */
    fun leftTimeClicked() {
        val year = toDate.get(Calendar.YEAR)
        val month = toDate.get(Calendar.MONTH)
        val day = toDate.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            context,
            { _, year2, monthOfYear, dayOfMonth ->
                toDate.set(year2, monthOfYear, dayOfMonth, 0, 0, 0)
                toDate.set(Calendar.MILLISECOND, 0)
                currentDateNum = -1
            },
            year,
            month,
            day
        )
        dpd.show()
    }

    /**
     * Start the timer!
     */
    fun startTimer() {

        val task = object : TimerTask() {
            override fun run() {
                updateTime()
            }
        }
        // Schedule timer every 100ms to update the counters.
        timer.start(task)
    }

    private fun updateTime() {
        val localDateTime = LocalDateTime.now()
        newCurrentDate = localDateTime.dayOfMonth
        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        currentTime.set(localDateTime.format(formatter))
        if (currentDateNum != newCurrentDate) {
            val weekDate = getNowWeek()
            dateColor.set(weekDate.startsWith("星期"))
            currentDate.set("${getNowDate()}  $weekDate")
            nongliDate.set("${getNongLi()}  ${getLeftDays()}")
            currentDateNum = newCurrentDate
        }
    }

    fun getNongLi(): String {
        val calendar: Calendar = Calendar.getInstance()
        return "农历 ${LunarCalendar.getLunarText(
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH) + 1,
            calendar.get(Calendar.DAY_OF_MONTH)
        )}"
    }

    fun getLeftDays(): String {
        val cNow = Calendar.getInstance()
        cNow.set(Calendar.HOUR_OF_DAY, 0)
        cNow.set(Calendar.MINUTE, 0)
        cNow.set(Calendar.SECOND, 0)
        cNow.set(Calendar.MILLISECOND, 0)
        val diff = toDate.timeInMillis - cNow.timeInMillis
        val leftDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS).toInt()
        return if (leftDays > 0) "  还剩 $leftDays 天" else ""
    }

    fun getNowWeek(): String {
        val calendar: Calendar = Calendar.getInstance()

        val solar = LunarCalendar.gregorianFestival(
            calendar.get(Calendar.MONTH) + 1,
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        if (!solar.isEmpty()) return solar

        val day: Int = calendar.get(Calendar.DAY_OF_WEEK)
        val weekString = "日一二三四五六"
        return "星期${weekString.substring(day - 1, day)}"
    }

    fun getNowDate(): String? {
        val localDateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日")
        return localDateTime.format(formatter)
    }
}
