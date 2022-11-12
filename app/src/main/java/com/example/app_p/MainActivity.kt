package com.example.app_p

import android.annotation.SuppressLint
import android.media.MediaDrm.OnEventListener
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById(R.id.botoncito) as Button
        boton.setOnClickListener{
                view -> verEnPantalla("Thanks for write your text")


        var write : EditText = findViewById(R.id.writetext)

        var texto1 : String = write.text.toString()

            Toast.makeText(this, texto1, Toast.LENGTH_LONG).show()

        }
    }


    fun verEnPantalla(s: String){
        val text =findViewById(R.id.textito) as TextView
        text.setText(s)
    }
}