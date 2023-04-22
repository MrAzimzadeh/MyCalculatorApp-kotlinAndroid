package com.azimzada.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var sayiGoster = findViewById<EditText>(R.id.sayiGoster)

    //buradan
    fun btnSayiTik(view: View) {
        if (yeniOperator) {
            sayiGoster.setText("")
        }
        yeniOperator = false
        //  var btn0 = findViewById<Button>(R.id.btn0)
        var btnSec = view as Button
        var btnTikDeger: String = sayiGoster.text.toString()
        when (btnSec.id) {
            findViewById<Button>(R.id.btn0).id -> {
                btnTikDeger += "0"
            }
            findViewById<Button>(R.id.btn1).id -> {
                btnTikDeger += "1"
            }
            findViewById<Button>(R.id.btn2).id -> {
                btnTikDeger += "2"
            }
            findViewById<Button>(R.id.btn3).id -> {
                btnTikDeger += "3"
            }
            findViewById<Button>(R.id.btn4).id -> {
                btnTikDeger += "4"
            }
            findViewById<Button>(R.id.btn5).id -> {
                btnTikDeger += "5"
            }
            findViewById<Button>(R.id.btn6).id -> {
                btnTikDeger += "6"
            }
            findViewById<Button>(R.id.btn7).id -> {
                btnTikDeger += "7"
            }
            findViewById<Button>(R.id.btn8).id -> {
                btnTikDeger += "8"
            }
            findViewById<Button>(R.id.btn9).id -> {
                btnTikDeger += "9"
            }
            findViewById<Button>(R.id.btnArtiEksi).id -> {
                btnTikDeger = "-" + btnTikDeger
            }
        }
        sayiGoster.setText(btnTikDeger)
    }

    //opertaor
    var operator = "*"
    var eskiSayi = ""
    var yeniOperator = true
    fun btnOpTik(view: View) {
        var btnSec = view as Button

        when (btnSec.id) {
            findViewById<Button>(R.id.btnBol).id -> {
                operator = "/"
            }
            findViewById<Button>(R.id.btnVur).id -> {
                operator = "X"
            }
            findViewById<Button>(R.id.btnTopla).id -> {
                operator = "+"
            }
            findViewById<Button>(R.id.btnCikar).id -> {
                operator = "-"
            }
        }
        eskiSayi = sayiGoster.text.toString()
        yeniOperator = true
    }

    fun btnEsittirTik(view: View) {
        var yeniSayi = sayiGoster.text.toString()
        var sonucSayisi: Double? = null

        when (operator) {
            "/" -> {
                sonucSayisi = eskiSayi.toDouble() / yeniSayi.toDouble()
            }
            "*" -> {
                sonucSayisi = eskiSayi.toDouble() * yeniSayi.toDouble()
            }
            "+" -> {
                sonucSayisi = eskiSayi.toDouble() + yeniSayi.toDouble()
            }
            "-" -> {
                sonucSayisi = eskiSayi.toDouble() - yeniSayi.toDouble()
            }
        }
        sayiGoster.setText(sonucSayisi.toString())
        yeniOperator = true


    }


}