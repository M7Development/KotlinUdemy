fun main(args: Array<String>) {
var haha = Handy("IPhone8")
    haha.turnOn()
    haha.systemOS()
    haha.turnOff()

var ando = Handy("Ando")
    ando.systemOS()

var pc1 = Desktop()
    pc1.systemOS()

var tab = Tablet()
    tab.systemOS()

}

open class Computer{
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
}
/*__________________________________Handy-Class__________________________________________*/
class Handy(var handyName: String): Computer() {

    override val memory = "16GB"
    override var touchFunctionality = "YES"
    override val prozessor = "Snapdragon"

    override var preis = preisermittler(handyName)
    override val ram = ramermittler(handyName)

    fun phoneValidator(handyName: String): String{
        return if (handyName.startsWith("IPhone")) "IOS" else "Android"
    }

    fun preisermittler(handyName: String): Int{
        return if (handyName.startsWith("IPhone")) 1300 else 1000
    }

    fun ramermittler(handyName: String): String{
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
class Desktop: Computer(){
    override val prozessor: String
        get() = super.prozessor

    override var preis: Int = 0
        get() = super.preis
        set(value) {
            field =7} //herausfinden wie das funktioniert


    override fun systemOS() {
        println("Linux OS mit $prozessor und kostet $preis")
    }
}
/*__________________________________Tablet-Class__________________________________________*/
class Tablet: Computer(){
    override val prozessor: String
        get() = super.prozessor

    override val ram = "24GB"

    override var preis = 1200

}