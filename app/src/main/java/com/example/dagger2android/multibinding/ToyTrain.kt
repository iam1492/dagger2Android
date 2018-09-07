package com.example.dagger2android.multibinding

import javax.inject.Inject

class ToyTrain @Inject constructor(): Train {
    override fun go(): String {
        return "go slow"
    }
}