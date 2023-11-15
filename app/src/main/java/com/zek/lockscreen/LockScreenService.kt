package com.zek.lockscreen

import android.app.Service
import android.content.Intent
import android.os.IBinder
import java.io.IOException

class LockScreenService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        try {
            val cmd = "su -c input keyevent 6\n"
            Runtime.getRuntime().exec(cmd)
        } catch (e: IOException) {
            // 处理异常
        }
        stopSelf()
        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}