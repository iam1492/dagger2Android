package com.example.dagger2android.constructInjection

class Chair private constructor(val name: String?) {
    data class Builder(private var name: String? = null) {
        fun name(name: String) = apply { this.name =  name }
        fun build() = Chair(name)
    }
}