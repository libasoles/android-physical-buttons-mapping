package com.libasoles.fakepoweroff

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.KeyEvent
import android.view.accessibility.AccessibilityEvent

class PowerButtonService : AccessibilityService() {

    override fun onInterrupt() {
        Log.i("Service", "Disconnected :/")
    }

    override fun onServiceConnected() {
        super.onServiceConnected()

        Log.i("Service", "Connected :)")
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}

    override fun onKeyEvent(event: KeyEvent?): Boolean {
        if (event != null) {
            Log.i("Key event", KeyEvent.keyCodeToString(event.keyCode))
        }

        return false // return true if you handled it, false if you bubble it to delegate
    }
}
