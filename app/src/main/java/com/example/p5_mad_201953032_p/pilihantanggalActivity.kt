package com.example.p5_mad_201953032_p

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.DateFormat

class pilihantanggalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihantanggal)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun klikTanggal(view: View) {
        val mCalendar = Calendar.getInstance()

        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, monthOfYear, dayOfMonth ->
                mCalendar.set(Calendar.YEAR, year)
                mCalendar.set(Calendar.MONTH, monthOfYear)
                mCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val date: String = DateFormat.getDateInstance(DateFormat.MEDIUM).format(mCalendar.time)
                Toast.makeText(this, "tanggal yang dipilih " + date, Toast.LENGTH_LONG).show()
            },
            mCalendar.get(Calendar.YEAR),
            mCalendar.get(Calendar.MONTH),
            mCalendar.get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.show()
    }
}