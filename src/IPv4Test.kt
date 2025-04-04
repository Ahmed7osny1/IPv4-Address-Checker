fun main() {

    testIPv4(
        name = "IPv4 is null",
        result = isValidIPv4(null),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 is Empty",
        result = isValidIPv4(""),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 is Whitespace",
        result = isValidIPv4(" "),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 have Commas instead of dots",
        result = isValidIPv4("192,168,1,1"),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 address with less than four segments",
        result = isValidIPv4("192.168.1"),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 address with more than four segments",
        result = isValidIPv4("192.168.1.1.1"),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 address have Consecutive dots",
        result = isValidIPv4("192..1.1"),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 address have Trailing dot",
        result = isValidIPv4("192.225.1.1."),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 address have Leading dot",
        result = isValidIPv4(".192.225.1.1"),
        correctResult = false
    )
    testIPv4(
        name = "segment Contains a letter",
        result = isValidIPv4("192.168.2.a"),
        correctResult = false
    )
    testIPv4(
        name = "Non-numeric word segments",
        result = isValidIPv4("1.1.1.one"),
        correctResult = false
    )
    testIPv4(
        name = "Completely non-numeric segments",
        result = isValidIPv4("abcd.efgh.ijkl.mnop"),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 with spaces between segments",
        result = isValidIPv4("192. 168.1.1"),
        correctResult = false
    )
    testIPv4(
        name = "IPv4 address with Special characters",
        result = isValidIPv4("192.168.1.1#"),
        correctResult = false
    )
    testIPv4(
        name = "segment with leading zeros",
        result = isValidIPv4("1.168.001.1"),
        correctResult = false
    )
    testIPv4(
        name = "segment with Leading zero in first segment",
        result = isValidIPv4("01.168.1.1"),
        correctResult = false
    )
    testIPv4(
        name = "segment with leading zeros with no number",
        result = isValidIPv4("1.168.00.1"),
        correctResult = false
    )
    testIPv4(
        name = "segment out of range (Have Negative Number)",
        result = isValidIPv4("192.255.1.-1"),
        correctResult = false
    )
    testIPv4(
        name = "segment out of range (0 - 255)",
        result = isValidIPv4("192.300.1.1"),
        correctResult = false
    )
    testIPv4(
        name = "valid IP address (Private IP Address)",
        result = isValidIPv4("192.168.0.0"),
        correctResult = true
    )
    testIPv4(
        name = "valid IP address (Reserved IP Address broadcast communications)",
        result = isValidIPv4("255.255.255.255"),
        correctResult = true
    )
    testIPv4(
        name = "valid IP address (Reserved IP Address default route)",
        result = isValidIPv4("0.0.0.0"),
        correctResult = true
    )
    testIPv4(
        name = "valid IP address (Private IP Address)",
        result = isValidIPv4("10.255.255.255"),
        correctResult = true
    )

}
fun testIPv4(
    name:String,
    result:Boolean,
    correctResult:Boolean

){
    if(correctResult == result){
        println("Success :$name")
    }
    else{
        println("Failed :$name")
    }
}