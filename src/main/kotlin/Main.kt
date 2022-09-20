import kotlin.math.pow

fun main(args: Array<String>) {

//___________________________________________________________Chars
    var character: Char = 'a'
    character ='\t' // für die Ausgabe eines Tabulators \n steht für neue Zeile/Zeilenumbruch Backslash \ ist zum maskeiren da
                    // z.B. '\'' für die Ausgabe von '
    print(character)
    println("Hello World")

    var unicode: Char = '\u22B9' // Ausgabe von Unicode
    println(unicode)
//___________________________________________________________Strings
    var helloWorldString :String = "Hello World!!!!!!!!"
    helloWorldString = "doch nciht hello World"
    println(helloWorldString)
//___________________________________________________________Zahlen
    var width: Int = 1920
    val height: Int = 1080
    val pi: Double = 3.14 //Float: 32Bit, Double: 64Bit
    println(width*height)
    width = 2550
    print(width*pi)

//__________________________________________________________Array
    var testArray = arrayOf(123,222,333,"blabla")
    println(testArray[3])

    val festesArray =Array(3){i -> i}   //__________ Selbstständig begrenztes Array (nur für Zahlen)
    println(festesArray[2])

//__________________________________________________________IF--Elegant BEST WAY TO USE
// -- Wichtig ist, das die niedrigste bzw. am leistesten zu erfüllende Bedingung als erstes abgefragt wird!

fun canIDrink(age:Int):String{
    if (age<14) return "Noway, man"
    if (age<16) return "No, but If you hide then one beer"
    if (age<18) return "A little bit man"
    return "Enjoy your time"
}
    println(canIDrink(15))

// Neue Abfrage Maximum berechnen
    fun maximumRechner(zahl:Int,zahl2:Int):String{
    var max:Int
    if(zahl>zahl2) max=zahl
    else max=zahl2

    return "Das Maximum ist: $max"
    }

    println(maximumRechner(23,34554))
    println(maximumRechner(435435345,5))
//__________________________________________________________Booleans
// -- Damit lassen sich coole Wahrheitswerte darstellen!
// -- Auslagerung in ein Boolean (wahrheitswert)   !true entspicht false
    var a:Int = 100
    var b:Int =100
    var wahrheitswert: Boolean = ((a == b && 42 < 5 || 2 > 1) && ("hallo"[0] == 'h'))
    println("Ist die Aussage wahr? $wahrheitswert")
//__________________________________________________________for-Schleife
    val meinArray: String = "hello World"
    for (buchstabe in meinArray){
        println(buchstabe)
    }
    println(meinArray)

    for (buchstabe in meinArray){
        print(buchstabe+3)          //dadurch wird im Alphabet der jeweils 3. nahcfolgende Buchstabe ausgegeben
    }

    print("\n")
    for (index in meinArray.indices){
        print(index)
        print(meinArray[index])
    }

    print("\n")
    fun verschlüsselung():String{
        var verschlüsseltesWort:String=""
        var buffer:String =""
        for (buchstabe in meinArray){

            verschlüsseltesWort += buffer
            buffer = (buchstabe+3).toString()
        }
        verschlüsseltesWort += buffer
        return verschlüsseltesWort
    }

    println(verschlüsselung())

    fun entschluesselung(Wort :String):String{
        var encryptedWord:String = ""
        var buffer:String =""
        for (buchstabe in Wort){

            encryptedWord+= buffer
            buffer = (buchstabe-3).toString()
        }
        encryptedWord+= buffer
        return encryptedWord
    }

    println(entschluesselung(verschlüsselung()))

//_______________________________________________Do Schleife & Do While Schleife

    var x:Int =15
    while(x>10){
        x=x-1
    print("hi")
    }

    x=3
    do{
        println("Eber")
        x=x-1
        println("du Eber")
    }while (x > 0)

//_________________________________________________ Array

    var meinArray2 = listOf(21313,123,234,234,34,5345,345,345,43,534,23,4,463,45,6,45,234,546,456,54)

    var meinArrayMutable =meinArray2.toMutableList()

    println(meinArray2)
    println(meinArray2.lastIndexOf(4))

       meinArrayMutable.sort()
    println(meinArrayMutable)

    meinArrayMutable.sortDescending()
    println(meinArrayMutable)

   var platz:Int = 1
   for(i in meinArrayMutable){

       println("Der $platz.te Platz hat $i Punkte")
       platz +=1
       if (platz==4){
           break
       }
   }

//__________________________________________________________________________________________________ Fakultät 5! = 5*4*3*2*1
var n: Int =12

    fun fakulteatVonZahl(numer:Int):Int {
        var i: Int = 0
        i = numer

        if (i==0){
            return 1
        }

        var temp: Int = 0
        var zwischenSumme: Int = 0
        var indexDurchlauf: Int = 0
        var ergebnisZahl: Int = 1

        while (i != 1) {

            temp = i
            i -= 1
            println(i)
            zwischenSumme = temp * i

            //__________Mathematische Verarbeitung
            if (indexDurchlauf==0){
                ergebnisZahl=ergebnisZahl*zwischenSumme
            }else{
                ergebnisZahl=ergebnisZahl*i
            }
            indexDurchlauf++

        }
        return ergebnisZahl
    }

        var ha:Int=fakulteatVonZahl(n)

        println("Fakultät von $n ist $ha")


//________________________________________________________________________________________________ Mehrdimensionale Arrays
    // Schachfeld:
    //2,3,4,5,6,4,3,2
    //1,1,1,1,1,1,1,1
    //0,0,0,0,0,0,0,0
    //0,0,0,0,0,0,0,0
    //0,0,0,0,0,0,0,0
    //0,0,0,0,0,0,0,0
    //1,1,1,1,1,1,1,1
    //2,3,4,5,6,4,3,2

    var zeile1 = arrayOf(2,3,4,5,6,4,3,2)
    var zeile2 = arrayOf(1,1,1,1,1,1,1,1)
    var zeile3 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile4 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile5 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile6 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile7 = arrayOf(1,1,1,1,1,1,1,1)
    var zeile8 = arrayOf(2,3,4,5,6,4,3,2)

    var spielfeld = arrayOf(zeile1,zeile2,zeile3,zeile4,zeile5,zeile6,zeile7,zeile8)

    // Veränderung auf dem Spielfeld!
    spielfeld[1][7]=0
    spielfeld[3][7]=1

    //Ausgabe des Spielfeldes!
    for (feld in spielfeld){
        for (x in feld){
            print(x)
        }
        print("\n")
    }
//________________________________________________________________________________________________ Nutzereingaben

    val userInput = readLine()
    // println(userInput)
    println("Möchtest du das Programm beenden? y/n")
    if (userInput=="y"){
        println("Bye")
    }
    else{
        println("Gib eine Zahl ein!")
        val zahl =Integer.valueOf(readLine())
        println(zahl+2)
    }

//________________________________________________________________________________________________ Integer Grenze

    // 32Bit

    var i:Int =0;

    while (i<i+1){
        i=i+1
    }
    println(i)
    println(i+1)
}







