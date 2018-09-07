package com.example.dagger2android.multibinding

import javax.inject.Inject

class FlyingTrain @Inject constructor(): Train {
    override fun go(): String {
        return "flying"
    }
}