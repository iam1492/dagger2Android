package com.example.dagger2android.qualifier

import dagger.Module
import dagger.Provides

@Module
internal class SubModule {

    @Provides
    @PerActivity
    @DocType("html")
    fun provideText1(): String {
        return "<h1>text</h1>"
    }

    @Provides
    @PerActivity
    @DocType("txt")
    fun provideText2(): String {
        return "text"
    }
}