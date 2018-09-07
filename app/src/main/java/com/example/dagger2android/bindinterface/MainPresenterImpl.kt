package com.example.dagger2android.bindinterface

import javax.inject.Inject

class MainPresenterImpl @Inject constructor(val fakeApi: FakeApi): MainPresenter {

    override fun requestHello(): String {
        return fakeApi.requestHello()
    }
}