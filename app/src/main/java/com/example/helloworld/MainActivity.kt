package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//: = extends
class MainActivity : AppCompatActivity() {

    //on create = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //create UI
        //R = resource()
        //svg folder

        setContentView(R.layout.activity_main)
    //TODO : Continue work here
        // find view by id=link program to UI
        //Java int x;
        //Kotlin val x :Int
        //val=value  var =variable (use if chg time to time)
    val button_login : Button = findViewById(R.id.button_login)
        button_login.setOnClickListener{
            showMessage()
            showReset()
        }
    }

    private fun showMessage() {
        val textViewMessage : TextView =findViewById(R.id.message)
            textViewMessage.setText(getString(R.string.hello))
            textViewMessage.setText(getString(R.string.reset))
    }


}
