fun main(args: Array<String>) {
val haha = Handy("IPhone8")
    haha.turnOn()
    haha.systemOS()
    haha.turnOff()

val ando = Handy("Ando")
    ando.systemOS()

val pc1 = Desktop()
    pc1.systemOS()

val tab = Tablet()
    tab.systemOS()

val myDevices : Array<Computer> = arrayOf(haha,pc1,tab,Handy("IPhoneX"))
    for (i in myDevices){
        println("Ausgabe ${i.systemOS()}")
    }

val pc2= Desktop()
    pc2.connect()
    pc2.systemOS()

    var aktenkoffer:Aktenkoffer = Aktenkoffer()
    aktenkoffer.insertLaptop(tab)
    aktenkoffer.pullOutLaptop()?.systemOS()
    println(aktenkoffer.pullOutLaptop()?.ram)



/*_______________________________________TypeCast_Lektion_59________________________________*/
val myPC: Desktop = pc1
    if (myPC is Wifi){
        println("Yoo ist ein Computer")
    }

    println(aktenkoffer.generateTablet())

/*__________________________________TypeCast erzwingen______________________________________*/
    var unsafeLaptop: Tablet = myPC as Tablet
    println(unsafeLaptop)




}


open class Computer {
    open val prozessor = "M1X"
    open val ram = ""
    open val memory = ""
    open var preis = 1000
    open var touchFunctionality =""

    open fun systemOS(){
        println("Welcome to .. OS")
    }
    fun turnOn(){
        println("System turnt on")
    }
    fun turnOff(){
        println("System turnt off")
    }

    override fun toString(): String {
        return "Computer(prozessor='$prozessor', ram='$ram', memory='$memory', preis=$preis, touchFunctionality='$touchFunctionality')"
    }

}
/*__________________________________Handy-Class__________________________________________*/
class Handy(var handyName: String): Computer() {

    override val memory = "16GB"
    override var touchFunctionality = "YES"
    override val prozessor = "Snapdragon"

    override var preis = preisermittler(handyName)
    override val ram = ramermittler(handyName)

    private fun phoneValidator(handyName: String): String{
        return if (handyName.startsWith("IPhone")) "IOS" else "Android"
    }

    private fun preisermittler(handyName: String): Int{
        return if (handyName.startsWith("IPhone")) 1300 else 1000
    }

    private fun ramermittler(handyName: String): String{
        return if (handyName.startsWith("IPhone")) "8GB" else "16GB"
    }



    override fun systemOS() {
        println("The device is a $handyName and has $memory of memory and touch? $touchFunctionality")
        println("So it's an ${phoneValidator(handyName)}")
        println("Der Preis beträgt: $preis und RAM hatta $ram")
        println("Der Prozessor ist ein $prozessor")
    }
}
/*__________________________________Desktop-Class__________________________________________*/
class Desktop() : Computer(), Wifi{
    override val prozessor: String
        get() = super.prozessor

    override var preis: Int = 0
        get() = super.preis
        set(value) {
            field =7} //herausfinden wie das funktioniert

    override var connected: Boolean = false
    override val cardname: String = "Gforce"
    override fun connect() {
        connected = true
    }

    override fun systemOS() {
        println("Linux OS mit $prozessor und kostet $preis")
        println(connected)
        println(cardname)
    }
}
/*__________________________________Tablet-Class__________________________________________*/
class Tablet: Computer(){
    override val prozessor: String
        get() = super.prozessor

    override val ram = "24GB"

    override var preis = 1200

    override fun systemOS() {
        println(super.prozessor)
        super.systemOS()
        println("-----------ENDE-----------")
    }

}

interface Wifi{
    var connected: Boolean
    val cardname: String

    fun connect()

    fun printConnectedStatus(){
        println("Connected? $connected")
    }

}

class Aktenkoffer(){
    lateinit var laptop: Tablet     // wird bei noch nicht initialisierten Variablen eingesetzt

    fun insertLaptop(l: Tablet){    // funktion um Initialisierung zu machen
        laptop=l
    }
    fun pullOutLaptop(): Tablet?{
        if(this::laptop.isInitialized){
            return laptop
        }else{
            return null
        }
    }
}

/*_______________________________________Extensions_____________ wurde außerhalb einer Class erstellt________________________*/
fun Aktenkoffer.generateTablet() :Tablet{
    return Tablet()
}

