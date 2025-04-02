package org.devio.hi.library.app.demo

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.devio.hi.library.app.R
import org.devio.hi.library.log.HiLog
import org.devio.hi.library.log.HiLogConfig
import org.devio.hi.library.log.HiLogManager

class HiLogDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_log_demo)
        findViewById<View>(R.id.btn_log).setOnClickListener {
            printLog();
        }
    }

    private fun printLog(){
        HiLogManager.init(object : HiLogConfig() {
            override fun getGlobalTag(): String {
                return "DemoActivity"
            }
            override fun enable(): Boolean {
                return true
            }
        })
        HiLog.a(9900)
    }
}