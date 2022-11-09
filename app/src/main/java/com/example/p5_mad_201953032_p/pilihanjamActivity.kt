package com.example.p5_mad_201953032_p

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.DateFormat

class pilihanjamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihanjam)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun klikJam(view: View) {
        val mCalendar = Calendar.getInstance()

        val timePickerDialog = TimePickerDialog(
            this,
            { timePicker, hourOfDay, minute ->
                mCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                mCalendar.set(Calendar.MINUTE, minute)
                val time = DateFormat.getTimeInstance(DateFormat.SHORT).format(mCalendar.time)
                Toast.makeText(this, "jam yang dipilih " + time, Toast.LENGTH_LONG).show()
            },
            mCalendar.get(Calendar.HOUR_OF_DAY),
            mCalendar.get(Calendar.MINUTE),
            true
        )
        timePickerDialog.show()
    }
}