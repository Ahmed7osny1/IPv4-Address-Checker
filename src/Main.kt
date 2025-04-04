fun main() {
    println(isValidIPv4("192.1.1.1"))
}

fun isValidIPv4(address: String?): Boolean {

    if (address.isNullOrBlank()) return false

    val segments = address.split(".")

    if (segments.size != 4) return false

    segments.forEach { segment ->

        if (segment.isEmpty() || segment.length > 3) return false

        if (segment.length > 1 && segment.startsWith("0")) return false

        if (segment.any { !it.isDigit() }) return false

        val num = segment.toIntOrNull() ?: return false
        if (num !in 0..255) return false

    }
    return true
}