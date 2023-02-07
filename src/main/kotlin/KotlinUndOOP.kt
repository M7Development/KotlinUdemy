import kotlin.math.*

//_________________________________________________________________Klasse mit zwei Funktionen mit GETTER & SETTER
class Kreis(
    radius :Double){
    init {                              // Gute Hilfe um den aktuellen zustand des Constructors genau zu ermitteln
        println("Circle creation")
        println(radius)
        println(umpfangBerechnen())
        println(areaBerechnen())
    }

    constructor(radius: Double, printMe: String): this(radius){
        println(printMe)
    }

       var radius :Double=radius
       get() = field                        //__________________Getter
       set(value) {                         //__________________Setter
           if (value>=0.0){
               field = value
           }
       }
        var isValidCircle: Boolean = radius >=0.0
        get() = radius >= 0.0

    fun umpfangBerechnen():Double{
        var umpfang:Double
        umpfang=radius*2*PI
        return umpfang
    }
    fun areaBerechnen():Double = radius * radius * PI
}

fun main(args: Array<String>) {

    var k = Kreis(6.0, "Probe")
    k.radius = -3.0
    println(k.isValidCircle)

println("Umpfang ist: ${k.umpfangBerechnen()} und die Fläche ist: ${k.areaBerechnen()}")
}