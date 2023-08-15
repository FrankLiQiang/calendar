package com.frank.calendar2

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.frank.calendar2.databinding.ActivityMainBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Timer
import java.util.TimerTask
import java.util.concurrent.TimeUnit

class MainActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var thisTimer: Timer? = null
    private var thisTask: TimerTask? = null
    private var toDate: Calendar = Calendar.getInstance()
    private var currentDate: Int = -1
    private var newCurrentDate: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LunarCalendar.init(this)
        addTimer()
    }

    fun chooseDate(view: View) {
        val year = toDate.get(Calendar.YEAR)
        val month = toDate.get(Calendar.MONTH)
        val day = toDate.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            this,
            { _, year2, monthOfYear, dayOfMonth ->
                toDate.set(year2, monthOfYear, dayOfMonth, 0, 0, 0)
                toDate.set(Calendar.MILLISECOND, 0)
                currentDate = -1
            },
            year,
            month,
            day
        )
        dpd.show()
    }

    fun addTimer() {
        thisTimer = Timer()
        thisTask = object : TimerTask() {
            override fun run() {
                try {
                    binding.time.text = getNowTime()
                    if (currentDate != newCurrentDate) {
                        val weekDate = getNowWeek()
                        if (weekDate.startsWith("星期")) {
                            binding.date.setTextColor(getColor(R.color.teal_700))
                        } else {
                            binding.date.setTextColor(getColor(R.color.red))
                        }
                        binding.date.text = getNowDate() + "  " + weekDate
                        binding.week.text = getNongLi() + getLeftDays()
                        currentDate = newCurrentDate
                    }
                } catch (e: Exception) {
                    //TODO
                }
            }
        }
        thisTimer!!.schedule(thisTask, 0, 1000)
    }

    fun getNongLi(): String {
        val calendar: Calendar = Calendar.getInstance()
        return "农历 " + LunarCalendar.getLunarText(
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH) + 1,
            calendar.get(Calendar.DAY_OF_MONTH)
        )
    }

    fun getLeftDays(): String {
        val cNow = Calendar.getInstance()
        cNow.set(Calendar.HOUR_OF_DAY, 0)
        cNow.set(Calendar.MINUTE, 0)
        cNow.set(Calendar.SECOND, 0)
        cNow.set(Calendar.MILLISECOND, 0)
        val diff = toDate.timeInMillis - cNow.timeInMillis
        val leftDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS).toInt()
        if (leftDays > 0) {
            return "  还剩 " + leftDays + " 天"
        }
        return ""
    }

    fun getNowDate(): String? {
        val localDateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日")
        return localDateTime.format(formatter)
    }

    fun getNowTime(): String? {
        val localDateTime = LocalDateTime.now()
        newCurrentDate = localDateTime.dayOfMonth
        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        return localDateTime.format(formatter)
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
        return "星期" + weekString.substring(day - 1, day)
    }
}