package com.example.diexample.feature_2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("NewApi")
class ActivitySecondFeature : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            FrameLayout(this).apply {
                id = ID
            },
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        )

        supportFragmentManager.beginTransaction()
            .add(ID, FragmentSecondFeature())
            .commit()
    }
}

private const val ID = 123