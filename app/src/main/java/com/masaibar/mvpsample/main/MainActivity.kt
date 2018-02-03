package com.masaibar.mvpsample.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.masaibar.mvpsample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter: MainContract.Presenter by lazy {
        MainPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_increment.setOnClickListener {
            presenter.increment()
        }

        button_reset.setOnClickListener {
            presenter.reset()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun updateCount(count: Int) {
        text_count.text = count.toString()
    }
}
