package com.frank.calendar

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.frank.calendar.data.IntervalTimerViewModel
import com.frank.calendar.data.IntervalTimerViewModelFactory
import com.frank.calendar.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() {

    private val intervalTimerViewModel: IntervalTimerViewModel
            by viewModels(
                factoryProducer = { IntervalTimerViewModelFactory }
            )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        val viewmodel = intervalTimerViewModel
        binding.viewmodel = viewmodel

        setContentView(binding.root)
        LunarCalendar.init(this)
        viewmodel.addContext(this)
        viewmodel.startTimer()
    }

    fun chooseDate(view: View) {
        intervalTimerViewModel.leftTimeClicked()
    }
}