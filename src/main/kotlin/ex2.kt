/*
2- Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo.
 */

fun main() {

    println("Digite a base em centimetros:")
    val x = readln().toDouble()
    println("Digite a altura em centimetros:")
    val y = readln().toDouble()
    println("Area do retangulo: %.2f".format(x * y))

}