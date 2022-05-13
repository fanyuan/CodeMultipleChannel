package com.example.codemultiplechannel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.codemultiplechannel.databinding.ActivityMainBinding
import com.sample.lib1.Lib1Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.tv.run {
            append("\n\n")
            append(Utils.getStr())
            append("\n\n")
            append(Lib1Utils.getName())
            append("\n\n")
        }


    }
}