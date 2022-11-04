import kotlin.math.pow

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

//_________________________________________________________________________________________________ Sinus berechnen (Fehlerhaft Auflösung in Video 43)

fun sinusReiheErgebnis(z: Double):Double{
    var Ergebnis =0.0
    for ( n in 0..15){
        //Zählerfunktion / Nennerfunktion
        Ergebnis+=zaehlerSinusreihe(z,n)/nennerSinusreihe(n)
    }
    return Ergebnis
}
fun zaehlerSinusreihe(z: Double, int: Int):Double{
    var anfangsWert :Int =-1
    var resultZaehler = (anfangsWert.toDouble().pow(int.toDouble()))*expoZFun(z,2*int+1)
            return resultZaehler
}
fun expoZFun(z:Double, int: Int):Int{
    return z.pow(int.toDouble()).toInt()
}
fun nennerSinusreihe(int: Int):Double{
    return fakultaet(2*int+1)
}
fun fakultaet(n:Int): Double { // Argument Veringerung führt zum Ziel
    if (n<=1){
        return 1.0
    }
    return n*(fakultaet(n-1))
}


//____________________________________________________________________________________________________ String Manipulation
//____ In einem String --> IneinemString
fun stringNullenRadierer(str:String):String{

    return str.filterNot { it == ' ' }
}
//_____________________________________________-obere funktion funktioniert und die untere auch

fun replace(s:String):String{
    var resultString :String = ""

    for ( x in s){
        if (x!=' ') {
            resultString = resultString + x
        }
    }
    return resultString
}




fun main(args: Array<String>) {

    println(betragsRecher(745))

    println(einzeiligBetrag(-6))

    println(lambdaBetrag(-8))

    println(summeArray(arrayOf(1,2,3,4,45,65,67,78,98)))



//______________________________________________________
    println("Sinus Nenner: ${nennerSinusreihe(1)} ")
    println("Sinus Zähler: ${zaehlerSinusreihe(1.0,1)}")

    println("Ergebnis Sinusreihe von: ${sinusReiheErgebnis(5.0)}")

    var String1 :String = "In einem String   ghjjhjhkg"

    println("Ergebnis Stringmanipulation: ${stringNullenRadierer(String1)}")

    println(replace("String wiedergabe ohne Leerzeichen"))

}