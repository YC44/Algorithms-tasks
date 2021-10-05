import java.math.BigInteger

fun factorial(num: Int): BigInteger{
    var output =BigInteger.ONE;
    for (i in 1..num)
        output *=i.toBigInteger()
    return output;
}