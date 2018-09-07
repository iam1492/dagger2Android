package com.example.dagger2android.multibinding

import javax.inject.Inject

class SuperTrain @Inject constructor(): Train {
    override fun go(): String {
        return "go fast"
    }
}