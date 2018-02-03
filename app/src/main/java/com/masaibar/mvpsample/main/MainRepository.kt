package com.masaibar.mvpsample.main

import android.content.Context
import android.widget.Toast

class MainRepository(private val context: Context) {

    var count = 0

    fun incrementCount() {
        count++
    }

    fun resetCount() {
        count = 0
    }

    fun showToast() {
        Toast.makeText(context, "hogehoge", Toast.LENGTH_SHORT).show()
    }
}