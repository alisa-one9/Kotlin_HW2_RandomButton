package com.example.kotlin_hw2_randombutton.view.extention

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.downLoad(uri:String){
    Glide.with(this).load(uri).into(this)

}