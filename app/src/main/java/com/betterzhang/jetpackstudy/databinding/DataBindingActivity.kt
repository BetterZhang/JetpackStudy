package com.betterzhang.jetpackstudy.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.betterzhang.jetpackstudy.R
import com.betterzhang.jetpackstudy.model.User

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        var user = User("小明", "123456")
        binding.user = user
    }
}
