package org.compose.tutorialmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform