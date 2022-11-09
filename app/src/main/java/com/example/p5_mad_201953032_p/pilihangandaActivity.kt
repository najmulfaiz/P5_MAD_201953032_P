package com.example.p5_mad_201953032_p

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.*

class pilihangandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihanganda)
    }

    fun klikGanda(view: View) {
        val daftarPilihanGanda = arrayOf("Bakso", "Nasi Goreng", "Sate Ayam", "Sop Daging")
        val statusPilihan = booleanArrayOf(false, true, false, false)
        val yangDipilih = Arrays.asList(*daftarPilihanGanda)

        AlertDialog.Builder(this)
            .setTitle("Mau pesan apa?")
            .setMultiChoiceItems(
                daftarPilihanGanda, statusPilihan
            ) { dialog, i, isChecked ->
                Log.d("MainActivity", "cek pilihan " + i);
            }
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, i ->
                for (i in statusPilihan.indices) {
                    val checked = statusPilihan[i]
                    if (checked) {
                        Toast.makeText(this, "anda memesan " + yangDipilih[i], Toast.LENGTH_SHORT).show()
                    }
                }
            })
            .setNegativeButton("Batal", null)
            .show()
    }
}