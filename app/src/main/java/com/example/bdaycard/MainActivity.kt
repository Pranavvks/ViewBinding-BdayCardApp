package com.example.bdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bdaycard.databinding.ActivityMainBinding

const val EXTRA_MESSAGE = "com.example.bdaycard.Message"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val message = binding.Inputname.editableText
        binding.birthdaybutton.setOnClickListener {
            val intent = Intent(this, BirthdayGreetingActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
                startActivity(intent)
//            Toast.makeText(this, "name is ${binding.Inputname.editableText}", Toast.LENGTH_SHORT).show()
        }

        setContentView(binding.root)


    }
}



