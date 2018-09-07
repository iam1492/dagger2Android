package com.example.dagger2android

import android.content.ClipboardManager
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Dagger2Application): Context = application.applicationContext

    @Provides
    fun providesClipboardManager(context: Context): ClipboardManager =
            context.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE)
                    as ClipboardManager
}