fun isPrimeNumber(number: Int): Boolean{
    var numberOfdivider=0
    for (i in 2..number/2)
        if (number % i ==0)
            numberOfdivider++
    return numberOfdivider==0
    // the number of dividers inbetween should be 0 since a prime number can only be divided by itself and 1
}

fun getPrimeNumbersTo(number: Int): String{
    var output=""
    for (i in 2..number)
        if (isPrimeNumber(i))
            output += "$i,"

    return output.substring(0,output.length-1)
}