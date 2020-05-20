package com.betterzhang.jetpackstudy.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.betterzhang.jetpackstudy.databinding.ActivityViewBindingBinding
import com.betterzhang.jetpackstudy.databinding.LayoutTextTwoBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding
    private lateinit var layoutTextTwoBinding: LayoutTextTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        // <inlude> 带 <merge>标签的特殊用法
        layoutTextTwoBinding = LayoutTextTwoBinding.bind(binding.root)
        setContentView(binding.root)

        binding.textView.setText("Android ViewBinding")
        binding.button.setOnClickListener {
            Toast.makeText(this, "Hello ViewBinding", Toast.LENGTH_SHORT).show()
        }

        binding.layoutTextOne.tvIncludeOne.setText("<include> 不带 <merge> 标签")
        layoutTextTwoBinding.tvIncludeTwo.setText("<include> 带 <merge> 标签")
    }
}
