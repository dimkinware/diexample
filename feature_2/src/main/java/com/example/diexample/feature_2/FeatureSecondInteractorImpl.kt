package com.example.diexample.feature_2

import javax.inject.Inject

internal class FeatureSecondInteractorImpl @Inject constructor(
    private val repo : FeatureSecondRepo
)    : FeatureSecondInteractor {

    init {
        println("init FeatureSecondInteractor")
    }

    override fun getFeatureValue(): String {
        return repo.getValue()
    }
}