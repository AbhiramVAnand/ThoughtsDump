package org.abhiram.thoughtsdump

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform