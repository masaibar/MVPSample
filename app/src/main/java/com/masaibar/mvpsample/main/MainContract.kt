package com.masaibar.mvpsample.main

import com.masaibar.mvpsample.BasePresenter
import com.masaibar.mvpsample.BaseView

interface MainContract {

    interface View : BaseView<Presenter> {
        fun updateCount(count: Int)
    }

    interface Presenter : BasePresenter<View> {

        fun increment()

        fun reset()

        fun save()

        fun load()
    }
}