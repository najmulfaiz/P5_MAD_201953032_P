package com.example.p5_mad_201953032_p

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun klikAlert(view: View) {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah anda sehat")
            .setPositiveButton("Ya",
            DialogInterface.OnClickListener { dialog, i ->
                Toast.makeText(this, "Sehat selalu kak ! :D", Toast.LENGTH_LONG).show();
            })
            .setNegativeButton("Tidak",
            DialogInterface.OnClickListener { dialog, i ->
                Toast.makeText(this, "Semoga lekas sembuh kakak ! ;(", Toast.LENGTH_LONG).show();
            }).show()
    }

}