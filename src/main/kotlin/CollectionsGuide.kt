

fun main() {
    var basicArray = intArrayOf(1,2,3,4)
    var charArray = charArrayOf('h','a')
    var haString = String(charArray)
    var basicList = listOf(1,2,3,4)
    println(basicArray)     /*Arrays sind vom Zugriff her deutlich schneller als Listen, da die Elemente im Speicher hintereinander angeordnet sind und dadurch schneller abrufbar*/
    println(basicList)

    var addedList = basicList +5
    println(addedList)

    basicList += 6
    println(basicList.getOrElse(6){ "Element not found"})
    println(basicList.component4())

    /**
     * Listen elemente einfügen und löschen
     */
    basicList += listOf(4,5,6,78,9) + 9
    basicList += 99
    basicList -= 9
    basicList -= 5
    println(basicList)
    basicList -= listOf(2,4,78)
    println(basicList)

    /**
     * Reverser, Partition, Slice, Chunked
     */

    println(basicList.reversed())
    var reservedList = basicList.reversed()
    println(reservedList)
//_______________________________________ Aufteilung in 2 Listen (liste die größer 3 ist und der rest)
    var partitionedList = basicList.partition { it > 3 }
    println(partitionedList)

    var slicedList = basicList.slice(1..3) // hier wird das 2. , 3. und 4. Element der Liste rausgeholt!
    println(slicedList)


    println(basicList)
    var newList = basicList-99+slicedList+99
    println(newList)

    var insertedList = basicList.slice(0..4) + slicedList + basicList.slice(9..basicList.size) //___________ hinzufügen eines elementes an einer bestimmten Stelle der Liste
    println(insertedList)

    var chunked = basicList.chunked(2) //_______________ Aufteilen in gleich größe Stücke
    println(chunked)

    /**
     * Take and Drop
     */
    var takeList = basicList.take(2) //_________ Die ersten beiden Elemente der liste werden rausgenommen
    println(takeList)

    var dropList = basicList.drop(2) //_________ Die Elemente nach den ersten beiden Werten werden ausgegeben
    println(dropList)


    /**
     * Eine Funktion die an einem gewissen Index, der als Parameter übergeben wird ein Element, das auch als Parameter übergeben wird einfügt! --> bearbeiten von non mutuble Lists
     */
    fun insertElementInList(index :Int, wert :Int, alteListe :List<Int>):List<Int>{
        var neueListe :List<Int>
        var x1 = alteListe.take(index)
        var x2 = alteListe.drop(index)
        neueListe = x1+wert+x2
        return neueListe
    }


    println(basicList)

    println(insertElementInList(2,7,basicList))
    println(insertElementInList(0,7,basicList))
    println(insertElementInList(basicList.size,7,basicList))

    /**
    * Sortieren von Listen
    * */
    println(basicList.sorted())
    println(basicList.sortedDescending())
    println(basicList.sortedWith(Comparator<Int>{ a,b ->
        when{
            a==6 ->1
            b==6 ->-1
            else -> 0
        }
    }))

    /**
    Map-Funktion
     */
    fun doSomethingForMap(a:Int): Int{
        return a*a
    }

    fun doSomethingForMap2(a:Int): List<Int>{
        return listOf(1, a*a, a*a*a, a*a*a*a)
    }

    fun viererReihe(a:Int):List<Int>{
        return listOf(a*1, a*2, a*3, a*4, a*5, a*6, a*7, a*8, a*9, a*10)
    }

    println(basicList.map { doSomethingForMap(it) })    // damit lies sich jedes element mit 3 multiplizieren!
    println(basicList.map { doSomethingForMap2(it) })   // das ergebnis der Liste sind exponentielle Ausgaben der Werte der ursprünglichen liste
    basicList+=4
    println(basicList)
    println(basicList.map { /*if(it==4)*/
        when{
            it==4 -> viererReihe(it)
            else -> it
        } }) // erstellen einer viererreihe wenn das Element der basic liste 4 ist !!!!! sehr wichtig!

    /**
    Pair
     */
    val pair: Pair<Int,String> = Pair(1,"Etwas")
    println(pair)

    /**
     * Zip und Unzip
     */


}
