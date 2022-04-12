//1- Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

fun main() {
    println("digite um numero: ")
    val number = readLine()?.toInt()!!
    println("antecessor ${number - 1}")
}