package com.minimal.template.domain.model

enum class Theme(val key: String) {
    LIGHT(key = "light"),
    DARK(key = "dark"),
    SYSTEM(key = "system"),
    BATTERY(key = "battery")
}

fun themeFromKey(key: String): Theme? {
    return Theme.values().firstOrNull { it.key == key }
}