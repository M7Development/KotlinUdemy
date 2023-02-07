fun main(){
    romanToInt("ddfsfaasdfsadfw")
}
    fun romanToInt(s: String): Int {
        //Bedingungen
        var laenge :Boolean = 1 <= s.length && s.length <= 15

        if(laenge==true){
            println("ok")
            println(s.length)
        }
        return 3
    }
