package com.example.dagger2android.multibinding

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MultiBindingModule {

    @Binds
    @IntoMap
    @CarKey("superTrain")
    abstract fun bindSuperTrain(train: SuperTrain): Train

    @Binds
    @IntoMap
    @CarKey("flyingTrain")
    abstract fun bindFlyingTrain(train: FlyingTrain): Train

    @Binds
    @IntoMap
    @CarKey("toyTrain")
    abstract fun bindToyTrain(train: ToyTrain): Train

}