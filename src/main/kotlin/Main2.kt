// Kotlin spezifische Features
fun main() {

    /*____________________________________________ Maybe Type - null */
    var meinString: String? = "hallo"
    println(meinString?.length)

    //   println(meinString!!.length)  // Programm nimmt an, das der String nicht null ist --> Ergebnis ist eine Nullpointer Exception


    //___________________________________________ if not null SHORTCUT
    println(
        meinString?.length ?: "String ist null"
    ) // entweder wird der String ausgegeben oder es kommt eine Ausgabe, dass ein null Wert vorhanden ist

    var length2: Int? = meinString?.length ?: 0  // hier wird eine 0 ausgegeben wenn eigentlich ein null drin ist
    length2?.let {
        println(length2)
        println("bal bla test bla, length2 ist sicher nicht null")
    }

    //____________________________________________ unsigned Typen
    var positiveZahl : ULong = 0U // 2^64 -- ist da um nur positive Zahlen dar zu stellen --> höhere positive Zahlen sind dadurch möglich
    print((positiveZahl))

    //____________________________________________ if Zuweisungen
    var a = 42
    var b = 1335
    var max = if (a>b) a else b     // Tenery Operator
    println(max)

    //____________________________________________ nullable Booleans
    var meinBool: Boolean? = null // null, false, true

    if (meinBool == false){ // damit kann man 3 werte im Boolean ansteuern
        println(meinBool)
    } else{
        println("false or null")
    }

    //____________________________________________ Variable swappen - also-funktion
    var c: Int = 47
    var d: Int = 3241
    c = d.also { d = c }
    println(c)
    println(d)

    //____________________________________________ Typecast
    var meineVar: Int = 42
    var meineVar2: Long = meineVar.toLong()

    println(meineVar2)

    //____________________________________________ Break und Continue mit Labels
    var probeString:String = "hello darkness"

    var x = 5
    mateusz@while (x > 0){                          // schleife wird mit mateusz markiert --> das ist ein Label
        ebene@for (char: Char in probeString){
            print(char)
            if (char==' '){
                break@mateusz                       // dieses Break bricht nur aus der For-Schleife aus  // mit @ bricht es aus dem angegebenen Bereich aus (Label)
            }
        }
        x -= 1
    }

    //____________________________________________ Ranges
    for (i in 0..20){                           // Vereinfachung für eine For-Schleife
        println(i)
    }

    for (m in 50 downTo 30 step 3){             // In dreier Schritten herunterzählen
        println(m)
    }

    //____________________________________________ forEach
    var meinArrrrrrrrr = arrayOf(3425,435,435,345,435,453,45,34,4543,34,534,5,345)
    meinArrrrrrrrr.forEach { println(it) }                                          // forEach mit Iterator in Verbindung verwenden

    //____________________________________________ array.withIndex

    println("------------------------------")
    for ((i, zahl) in meinArrrrrrrrr.withIndex()){              // das ist geil! --> Ausgabe von Zahl und Index
        println("index = $i")
        println("zahl = $zahl")
    }

    //____________________________________________ Pattern matching mit when
    var xy: Int = 4
    when(xy){                                                   // hammergeile Funktion
        0,1,2,3,4,5 -> println("xy is between 0 and 5")
        in 6..42 -> println("xy is between 6 and 42")
        else -> {
            println("xy is unknown")
        }
    }

    var m = when(xy){                                           // Variablenzuweisung! das macht sehr viel möglich z.B. das eine Taste mehrmals die selbe Funktion bekommt
        in 0..42 -> 420
        else -> 50
    }
    println(m)

    when{
        xy > 5 || xy == 4 -> println("greater 5")
        xy <5 -> println("less then 5")
        else -> println("equals 5")
    }


    //__________________________________________Übung vielfaches berechnen von 7 dank Modulo
    var reihe: Int = 7

    println(4%2)

    for (ix in 0..1000000){
        if((ix%reihe)===0){
            println(ix)
        }
    }

}