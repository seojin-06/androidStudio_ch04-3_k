package com.cookandroid.project_k_4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cookandroid.project_k_4_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAdd.setOnClickListener {
            if(binding.edit1.text.isEmpty() || binding.edit2.text.isEmpty()){
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            }else{
                binding.tv1.text = "계산 결과: ${binding.edit1.text.toString().toFloat() + binding.edit2.text.toString().toFloat()}"
            }
        }

        binding.btnSub.setOnClickListener {
            if(binding.edit1.text.isEmpty() || binding.edit2.text.isEmpty()){
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            }else{
                binding.tv1.text = "계산 결과: ${binding.edit1.text.toString().toFloat() - binding.edit2.text.toString().toFloat()}"
            }
        }

        binding.btnMul.setOnClickListener {
            if(binding.edit1.text.isEmpty() || binding.edit2.text.isEmpty()){
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            }else{
                binding.tv1.text = "계산 결과: ${binding.edit1.text.toString().toFloat() * binding.edit2.text.toString().toFloat()}"
            }
        }

        binding.btnDiv.setOnClickListener {
            if(binding.edit1.text.isEmpty() || binding.edit2.text.isEmpty()){
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            }else{
                binding.tv1.text = "계산 결과: ${binding.edit1.text.toString().toFloat() / binding.edit2.text.toString().toFloat()}"
            }
        }
    }
}