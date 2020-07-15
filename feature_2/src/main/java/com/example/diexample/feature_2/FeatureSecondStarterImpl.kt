package com.example.diexample.feature_2

import android.app.Activity
import android.content.Intent
import com.example.diexample.feature_2.ui.ActivitySecondFeature

class FeatureSecondStarterImpl : FeatureSecondStarter {

    override fun start(parentActivity: Activity) {
        parentActivity.startActivity(Intent(parentActivity, ActivitySecondFeature::class.java))
    }
}