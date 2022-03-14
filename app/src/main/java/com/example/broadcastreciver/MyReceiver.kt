package com.example.broadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        when(intent.action){
            Intent.ACTION_BATTERY_LOW -> Toast.makeText(context,"ACTION BATTERY LOW",Toast.LENGTH_SHORT).show()
            Intent.ACTION_POWER_CONNECTED -> Toast.makeText(context,"ACTION POWER CONNECTED",Toast.LENGTH_SHORT).show()
            Intent.ACTION_POWER_DISCONNECTED -> Toast.makeText(context,"ACTION POWER DISCONNECTED",Toast.LENGTH_SHORT).show()
            Intent.ACTION_BOOT_COMPLETED -> Toast.makeText(context,"BOOT COMPLETED",Toast.LENGTH_SHORT).show()
        }
       //Toast.makeText(context,"Welcome to broadcast reciver",Toast.LENGTH_SHORT).show()
    }
}
