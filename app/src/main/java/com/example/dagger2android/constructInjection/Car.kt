package com.example.dagger2android.constructInjection

import javax.inject.Inject

class Car @Inject constructor(wheel: Wheel, engine: Engine, chair: Chair) {
    val name = "car has ${wheel.name} and ${engine.name} and ${chair.name}"
}