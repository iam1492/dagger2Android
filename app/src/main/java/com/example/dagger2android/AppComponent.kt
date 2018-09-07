package com.example.dagger2android

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, SubComponentInjectorModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Dagger2Application): Builder
        fun build(): AppComponent
    }

    fun inject(application: Dagger2Application)
}