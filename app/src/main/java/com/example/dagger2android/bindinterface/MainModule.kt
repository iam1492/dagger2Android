package com.example.dagger2android.bindinterface

import com.example.dagger2android.PerActivity
import dagger.Binds
import dagger.Module

@Module
internal abstract class MainModule {

    @Binds
    @PerActivity
    abstract fun mainPresenter(presenterImpl: MainPresenterImpl): MainPresenter
}