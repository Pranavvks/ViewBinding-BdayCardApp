package com.example.bdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bdaycard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.birthdaybutton.setOnClickListener {
            Toast.makeText(this, "name is ${binding.Inputname.editableText}", Toast.LENGTH_SHORT).show()
        }
            setContentView(binding.root)


    }
}



