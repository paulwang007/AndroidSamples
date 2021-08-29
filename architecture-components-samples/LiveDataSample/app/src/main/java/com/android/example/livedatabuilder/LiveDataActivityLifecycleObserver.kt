package com.android.example.livedatabuilder

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LiveDataActivityLifecycleObserver : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        source.lifecycleScope.launch {
            withContext(Dispatchers.Default) {
                println("LiveDataActivityLifecycleObserver() lifecycle event = $event")
            }
        }
    }
}
