package com.example.dagger2android.contextmodule

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ClassWithContextModule {

    @Provides
    fun provideClassWithContext(context: Context): ClassWithContext {
        return ClassWithContext(context)
    }
}