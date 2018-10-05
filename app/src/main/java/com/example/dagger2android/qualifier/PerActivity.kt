package com.example.dagger2android.qualifier

import javax.inject.Scope

@Retention(value = AnnotationRetention.RUNTIME)
@Scope
annotation class PerActivity