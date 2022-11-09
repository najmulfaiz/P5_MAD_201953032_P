package com.example.p5_mad_201953032_p

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class pilihantunggalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihantunggal)
    }

    fun klikTunggal(view: View) {
        val daftarPilihanTunggal = arrayOf("Bakso", "Nasi Goreng", "Sate Ayam", "Sop Daging")
        val statusPilihan = 2

        AlertDialog.Builder(this)
            .setTitle("Mau pesan apa?")
            .setSingleChoiceItems(
                daftarPilihanTunggal, statusPilihan
            ) { dialog, i -> }
            .setPositiveButton("OK",
                DialogInterface.OnClickListener { dialog, i ->
                    val posisi = (dialog as AlertDialog).listView.checkedItemPosition

                    if(posisi != -1) {
                        val yangDipilih = daftarPilihanTunggal[posisi]
                        Toast.makeText(this, "anda memesan " + yangDipilih, Toast.LENGTH_LONG).show()
                    }
                }
            )
            .setNegativeButton("Batal", null)
            .show()
    }
}