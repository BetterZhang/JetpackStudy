package com.betterzhang.jetpackstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.betterzhang.jetpackstudy.databinding.ActivityMainBinding
import com.betterzhang.jetpackstudy.databinding.DataBindingActivity
import com.betterzhang.jetpackstudy.viewbinding.ViewBindingActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnViewbinding.setOnClickListener { Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show() }
    }

    fun gotoViewBindingActivity(view: View) {
        startActivity(Intent(this, ViewBindingActivity::class.java))
    }

    fun gotoDataBindingActivity(view: View) {
        startActivity(Intent(this, DataBindingActivity::class.java))
    }

}
