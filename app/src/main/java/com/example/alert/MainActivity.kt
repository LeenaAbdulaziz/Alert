package com.example.alert

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun alert(view: android.view.View) {
        var at= AlertDialog.Builder(this)
        at.setTitle("Hello")
        val input = EditText(this)

        input.setHint("Enter your name")
        input.inputType = InputType.TYPE_CLASS_TEXT
        at.setView(input)
        at.setPositiveButton("Go", DialogInterface.OnClickListener { dialogInterface, i ->
            var intent=Intent(this,newpage::class.java)
            intent.putExtra("Anything",input.text.toString())
            startActivity(intent)

        })
        at.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        at.show()
    }

}

