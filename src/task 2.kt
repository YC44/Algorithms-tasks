import javax.xml.stream.events.Characters

fun questionsMarks(str :String): Boolean{
    var i=0
    var secondDigit: Char? =null
    var b=false
    var substring:String
    var firstDigit:Int
    while (!b && i<= str.length-1){
        if (str[i].isDigit()){
            if (secondDigit!= null){
                firstDigit=Character.getNumericValue(str[i])
                if (firstDigit+Character.getNumericValue(secondDigit)==10) {
                    // returning the substring between firstDigit and secondDigit
                    substring = str.substring(str.indexOf(secondDigit!!),i)
                    if (substring.filter { it=='?' }.count()==3)
                        b=true
                }}
            secondDigit=str[i]}
        i++
    }
    return b
}