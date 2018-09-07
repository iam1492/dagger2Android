package com.example.dagger2android.qualifier

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class DocType(val value: String = "")
