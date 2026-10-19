fun main() {

}

fun Ejercicio_01(){
    val num1: Int=8
    val num2: Int=8

    println("Suma: ${num1 + num2}")
    println("Resta: ${num1 - num2}")
    println("Multiplicación: ${num1 * num2}")
    println("División: ${num1 / num2}")
    println("Módulo: ${num1 % num2}")
}

fun Ejercicio_02(){
    val nom: String="Pedro"
    println("Bienvenido $nom")
}

fun Ejercicio_03(){
    println("Introduce tu nombre")
    val nom=readln()
    println("Bienvenido $nom")
}

fun Ejercicio_04(){
    println("Introduce un numero")
    val num1=readln()
    println("Introduce un numero")
    val num2=readln()
}

fun Ejercicio_05(){
    println("Introduce un numero")
    val num=readln().toInt()
    if (num%2==0){
        println("Es divisible entre dos")
    }else{
        println("No es divisible entre dos")
    }
}

fun Ejercicio_06(){
    println("¿Cuál es la capital de Colombia")
    println("""a. """)
}