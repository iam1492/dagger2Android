package com.example.dagger2android.bindinterface

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeApi @Inject constructor() {
    fun requestHello() = "hello"
}