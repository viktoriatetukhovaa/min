package com.example.myapplication

import android.animation.ObjectAnimator
import android.animation.ValueAnimator.INFINITE
import android.animation.ValueAnimator.REVERSE
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView)

        ObjectAnimator.ofFloat(image, View.ROTATION_X, 3600f).apply {
            duration = 7000
            interpolator = LinearInterpolator()
            repeatCount = INFINITE
            repeatMode = REVERSE
            start()
        }

        scheduleSplashScreen()
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 2000
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(
                this@MainActivity,
                nneew::class.java
            )
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}


