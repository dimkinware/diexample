package com.example.diexample.feature_2

import javax.inject.Inject

internal class FeatureSecondRepoImpl @Inject constructor() : FeatureSecondRepo {
    override fun getValue(): String {
        return  "Feature Second Super Value From Network"
    }

    override fun getValue2(): String {
        return  "Feature Second Value 2"
    }
}