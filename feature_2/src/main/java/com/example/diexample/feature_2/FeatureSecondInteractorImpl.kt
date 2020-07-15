package com.example.diexample.feature_2

class FeatureSecondInteractorImpl : FeatureSecondInteractor {

    init {
        println("init FeatureSecondInteractor")
    }

    override fun getFeatureValue(): String {
        return "Feature Second Super Value From Network"
    }
}