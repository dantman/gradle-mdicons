package com.tmiyamon.mdicons.ext

import java.util.LinkedHashMap

public fun <T, K> Array<out K>.toMapWith(block: (K) -> T): Map<K, T> {
    val result = LinkedHashMap<K, T>()
    for (element in this) {
        result.put(element, block(element))
    }
    return result
}
