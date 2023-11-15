package com.zek.lockscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import java.io.IOException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startService(Intent(this, LockScreenService::class.java))
        finish() // 关闭活动
    }
}
