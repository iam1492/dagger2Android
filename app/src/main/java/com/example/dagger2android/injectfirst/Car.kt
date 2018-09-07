package com.example.dagger2android.injectfirst

import javax.inject.Inject

class Car @Inject constructor(wheel: Wheel, engine: Engine) {
    val name = "car has ${wheel.name} and ${engine.name}"
}