package de.tofu.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform