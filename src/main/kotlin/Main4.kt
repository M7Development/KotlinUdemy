fun add(x :Int, y :Int = 17):Int{   // Das sind default werte, diese werden ersetzt sobald der funktion eigene parameterwerte mitgegeben werden
    return x+y
}

fun somethingWithArrays(a: Array<Int>, len :Int = a.size){
    println(len)
}

fun main(args: Array<String>) {

    println(add(49))

    somethingWithArrays(arrayOf(2,3,4))


// ________________________________________________Einzeilige Funktionen

    fun quadrat(x :Int):Int{ return x*x}

    println(quadrat(4))

// _______________________________________________Eine einzeilige Funktion:
    fun quadratOneLine(y :Int) = y*y

    println(quadratOneLine(5))

// _______________________________________________Lambda Funktionen

    val lambdaProbe = {a : Int, b :Int -> a+b}
    val result = lambdaProbe(10,56)
    println(result)
    println(add(49)==result)
}