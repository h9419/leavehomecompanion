package com.example.leavehomecompanion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private var launchIntent : Intent? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        launchIntent = packageManager.getLaunchIntentForPackage("hk.gov.ogcio.leavehomesafe")
        super.onCreate(savedInstanceState)
        if (launchIntent != null)
            this.startActivity(launchIntent)
    }
    override fun onResume() {
        super.onResume()
        if (launchIntent != null)
            this.startActivity(launchIntent)
    }
}