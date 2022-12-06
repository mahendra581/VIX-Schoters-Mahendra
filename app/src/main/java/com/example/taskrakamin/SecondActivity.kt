package com.example.taskrakamin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.taskrakamin.databinding.ActivitySecondBinding



class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_second)
        supportActionBar?.hide()
        setClickListener()

    }
    private fun setClickListener() = with(binding){
        button7.setOnClickListener {
            val intentToLogin = Intent(this@SecondActivity, ModelArticle::class.java)
        }
    }

}

