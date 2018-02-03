package com.masaibar.mvpsample.main

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import javax.inject.Singleton

//todo implement
@Singleton
class MainRepository(private val context: Context) {
    init {
        Log.d("!!!", "repository created")
    }

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

    private fun getSharedPreference(): SharedPreferences {
        return context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    }
}