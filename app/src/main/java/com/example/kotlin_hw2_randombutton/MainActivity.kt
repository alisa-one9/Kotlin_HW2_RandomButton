package com.example.kotlin_hw2_randombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.kotlin_hw2_randombutton.databinding.ActivityMainBinding
import com.example.kotlin_hw2_randombutton.view.extention.downLoad

class MainActivity : AppCompatActivity() {

    private var imagelist = arrayListOf<String>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        addImage()
        selectImage()
        submitImage()

    }

    private fun addImage() {
        imagelist.add("https://ichef.bbci.co.uk/news/594/cpsprodpb/A084/production/_120729014_2df075ca-3c47-49c1-830c-95c414530755.jpg")
        imagelist.add("https://ichef.bbci.co.uk/news/396/cpsprodpb/13CC4/production/_120729018_6b0c1a5f-d356-4b36-a401-94985e710441.jpg")
        imagelist.add("https://ichef.bbci.co.uk/news/800/cpsprodpb/163D4/production/_120729019_f1c5e663-3cdd-4ebf-a708-c8726df75d38.jpg")
        imagelist.add("https://ichef.bbci.co.uk/news/594/cpsprodpb/7974/production/_120729013_0a31d094-803d-413d-aec5-5e0a9ae2730f.jpg")
        imagelist.add("https://ichef.bbci.co.uk/news/594/cpsprodpb/082C/production/_120729020_de61eb9c-bbaa-4d22-b722-5d3ad545758c.jpg")
    }

    private fun selectImage() {
        binding.btnAdd.setOnClickListener {
            if (binding.editTextInputText1.text.isNullOrEmpty()) {
                Toast.makeText(this, "please, input the link", Toast.LENGTH_SHORT).show()
            } else {
                val link = binding.editTextInputText1.text.toString()
                imagelist.add(link)

            }
        }
    }

    private fun submitImage() {
        binding.btnShowOneImage.setOnClickListener {
            val s = imagelist.random()
            binding.imageView1.downLoad(s)
        }
    }

}