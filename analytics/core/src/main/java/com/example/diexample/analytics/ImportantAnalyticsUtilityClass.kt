package com.example.diexample.analytics

import javax.inject.Inject

interface ImportantAnalyticsUtility {
    fun provideImportantId(): String
}

class ImportantAnalyticsUtilityImpl @Inject constructor(): ImportantAnalyticsUtility {
    override fun provideImportantId(): String {
        return "lol kek cheburek"
    }
}