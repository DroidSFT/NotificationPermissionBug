package com.example.testnotificationapp

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.os.IBinder

class TestForegroundService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        startForeground(
            1,
            Notification.Builder(this)
                .setSmallIcon(android.R.drawable.ic_dialog_alert)
                .setContentTitle("Test title")
                .setContentText("Test text")
                .setOngoing(true)
                .build()
        )
    }
}
