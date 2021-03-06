package com.masaibar.mvpsample.main

class MainPresenter(
        private val view: MainContract.View, private val repository: MainRepository
) : MainContract.Presenter {

    override fun start() {
        view.updateCount(repository.count)
    }

    override fun increment() {
        repository.incrementCount()
        view.updateCount(repository.count)
    }

    override fun reset() {
        repository.resetCount()
        view.updateCount(repository.count)
    }

    override fun save() {
        repository.saveCount()
    }

    override fun load() {
        val count = repository.loadCount()
        view.updateCount(count)
    }
}