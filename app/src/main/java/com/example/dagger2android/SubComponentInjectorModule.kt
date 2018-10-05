package com.example.dagger2android

import com.example.dagger2android.bindinterface.MainModule
import com.example.dagger2android.qualifier.SubModule
import com.example.dagger2android.contextmodule.ClassWithContextModule
import com.example.dagger2android.multibinding.MultiBindingModule
import com.example.dagger2android.qualifier.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SubComponentInjectorModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainModule::class, ClassWithContextModule::class, SubModule::class, MultiBindingModule::class])
    abstract fun bindMainActivity(): MainActivity
}