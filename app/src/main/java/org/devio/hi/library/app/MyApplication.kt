package org.devio.hi.library.app

import android.app.Application
import org.devio.hi.library.log.HiLogConfig
import org.devio.hi.library.log.HiLogManager

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object: HiLogConfig(){
            override fun getGlobalTag(): String {
                return "MyApplication"
            }
            override fun enable(): Boolean {
                return true
            }
        })

    }
}