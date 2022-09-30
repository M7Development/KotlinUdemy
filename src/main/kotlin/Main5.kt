// |-42| = 42_____________________________ Betragsberechnung ___ die nachfolgenden 3 Funktionen machen das selbe
fun betragsRecher(a :Int):Int{
    var a = a
    if (a<0){
        var str :String = a.toString().drop(1)
        a = str.toInt()
    }
    return a
}

fun einzeiligBetrag(x:Int) = if (x<0) x*-1 else x

val lambdaBetrag = { c :Int -> if (c <0) c*-1 else c }


//________________________________________ Summe über eine Array bilden [1,2,3,4,45,65,67,78,98]

fun summeArray(ar :Array<Int>):Int{
 var x :Int =0
 ar.forEach { x+=it }
 return x
}

//________________________________________ Sinus berechnen



fun main(args: Array<String>) {

    println(betragsRecher(745))

    println(einzeiligBetrag(-6))

    println(lambdaBetrag(-8))

    println(summeArray(arrayOf(1,2,3,4,45,65,67,78,98)))

}