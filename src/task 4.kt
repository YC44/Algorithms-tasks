fun constructTree(strArr:Array<String>):Boolean{
    var children = mutableListOf<String>()
    var parents = mutableListOf<String>()
    var i =0
    var b=true
    while (b && i<= strArr.size-1){
        val child= strArr[i].substring(1,strArr[i].indexOf(","))
        val parent= strArr[i].substring(strArr[i].indexOf(",")+1,strArr[i].length-1)
        children.add(child)
        parents.add(parent)
        // the same child shouldn't have more than 1 parent
        //the same parent shouldn't have more than 2 children
        if (children.filter { it==child }.count()>1 || parents.filter { it==parent }.count()>2)
            b=false
        i++

    }
    return b
}