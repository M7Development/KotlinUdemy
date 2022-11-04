import kotlin.math.*

//_________________________________________________________________Klasse mit zwei Funktionen mit GETTER & SETTER
class Kreis(
    radius :Double){
   public var radius :Double=radius
       get() = field                        //__________________Getter
       set(value) {                         //__________________Setter
           if (value>=0.0){
               field = value
           }
       }
    public var isValidCircle: Boolean = radius >=0.0
        get() = radius >= 0.0

    fun umpfangBerechnen():Double{
        var umpfang:Double
        umpfang=radius*2*PI
        return umpfang
    }
    fun areaBerechnen():Double = radius * radius * PI
}

fun main(args: Array<String>) {

    var k: Kreis = Kreis(5.0)
    k.radius = -10.0
    println(k.isValidCircle)

println("Umpfang ist: ${k.umpfangBerechnen()} und die Fläche ist: ${k.areaBerechnen()}")
}