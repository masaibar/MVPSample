package com.masaibar.mvpsample.main

import android.os.Bundle
import com.masaibar.mvpsample.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainContract.View {

    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_increment.setOnClickListener {
            presenter.increment()
        }

        button_reset.setOnClickListener {
            presenter.reset()
        }

        button_save.setOnClickListener {
            presenter.save()
        }

        button_load.setOnClickListener {
            presenter.load()
        }

        presenter.start()
    }

    override fun updateCount(count: Int) {
        text_count.text = count.toString()
    }
}
