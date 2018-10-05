package com.example.dagger2android.bindinterface

import com.example.dagger2android.qualifier.PerActivity
import com.example.dagger2android.constructInjection.Chair
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
internal abstract class MainModule {

    @Binds
    @PerActivity
    abstract fun bindsCarPresenter(presenterImpl: CarPresenterImpl): CarPresenter

    @Module
    companion object {
        @JvmStatic @Provides
        internal fun providesChair(): Chair = Chair.Builder()
                .name("Super Chair")
                .build()
    }
}