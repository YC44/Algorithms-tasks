fun main(){
    for (i in 1..18)
        println(factorial(i))
    println(isPrimeNumber(23))
    println(getPrimeNumbersTo(6))
    println(getPrimeNumbersTo(25))
    println(questionsMarks("arrb6??4xxbl5???eee5"))
    println(constructTree(arrayOf("(1,2)","(2,4)","(5,7)","(7,2)","(9,5)")))
    println(constructTree(arrayOf("(1,2)","(3,2)","(2,12)","(5,2)")))
    println(constructTree(arrayOf("(1,2)", "(2,4)", "(7,2)")))
}