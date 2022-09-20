fun fakultaetRekursiv(n:Int): Int { // Argument Veringerung führt zum Ziel
    if (n<=1){
        return 1
    }

    return n*(fakultaetRekursiv(n-1))

}

fun main(args: Array<String>) {

 println(fakultaetRekursiv(5))



}