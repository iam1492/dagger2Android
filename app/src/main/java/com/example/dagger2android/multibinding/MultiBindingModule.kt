package com.example.dagger2android.multibinding

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MultiBindingModule {

    @Binds
    @IntoMap
    @CarKey(CarType.SUPER)
    abstract fun bindSuperTrain(train: SuperTrain): Train

    @Binds
    @IntoMap
    @CarKey(CarType.FLYING)
    abstract fun bindFlyingTrain(train: FlyingTrain): Train

    @Binds
    @IntoMap
    @CarKey(CarType.TOY)
    abstract fun bindToyTrain(train: ToyTrain): Train

}