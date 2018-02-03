package com.masaibar.mvpsample.main

import android.util.Log

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    override fun start() {
        view.updateCount(0)
    }

    override fun increment() {
        Log.d("!!!", "increment called.")
    }

    override fun reset() {
        Log.d("!!!", "reset called.")
    }
}