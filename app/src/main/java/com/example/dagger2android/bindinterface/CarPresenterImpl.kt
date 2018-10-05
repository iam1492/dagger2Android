package com.example.dagger2android.bindinterface

import javax.inject.Inject

class CarPresenterImpl @Inject constructor(private val fakeApi: FakeApi): CarPresenter {

    override fun requestHelloVendor(): String {
        return fakeApi.requestVendor()
    }
}