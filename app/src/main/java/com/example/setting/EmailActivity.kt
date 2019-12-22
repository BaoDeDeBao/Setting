package com.example.setting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_email.*

class EmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        buttonCancel.setOnClickListener {
            goBackEmailActivity()
        }
    }

    fun goBackEmailActivity() {
        var intentEmail = Intent(this, MainActivity::class.java)
        startActivity(intentEmail)
    }
}
