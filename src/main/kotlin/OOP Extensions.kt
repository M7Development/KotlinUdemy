open class A

class B: A()

class C{
    fun bar() ="CCC"
}

/*_____________Extensions___________ wann greifen sie, wann greifen sie nicht*/
fun A.bar() ="AAA"

fun B.bar() ="BBB"

fun printMe(a:A){
    println(a.bar())
}

fun C.bar() = "foobar"

fun main() {
    var b: B=B()
    println(b.bar())

    var a = b
    a.bar()

    printMe(b)

    println(C().bar())
}