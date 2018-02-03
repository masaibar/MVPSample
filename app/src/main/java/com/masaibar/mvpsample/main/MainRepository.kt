package com.masaibar.mvpsample.main

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

class MainRepository(private val context: Context) {

    var count = 0
        private set

    fun incrementCount() {
        count++
    }

    fun resetCount() {
        count = 0
    }

    fun saveCount() {
        getSharedPreference().edit().putInt("count", count).apply()
    }

    fun loadCount(): Int {
        count = getSharedPreference().getInt("count", -1)
        return count
    }

    fun showToast() {
        Toast.makeText(context, "hogehoge", Toast.LENGTH_SHORT).show()
    }

    private fun getSharedPreference(): SharedPreferences {
        return context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    }
}