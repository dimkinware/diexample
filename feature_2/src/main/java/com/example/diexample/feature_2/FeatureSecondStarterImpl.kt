package com.example.diexample.feature_2

import android.app.Activity
import android.content.Intent
import com.example.diexample.feature_2.ui.ActivitySecondFeature
import javax.inject.Inject

internal class FeatureSecondStarterImpl @Inject constructor(): FeatureSecondStarter {

    override fun start(parentActivity: Activity) {
        parentActivity.startActivity(Intent(parentActivity, ActivitySecondFeature::class.java))
    }
}