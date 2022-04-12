/*3- Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.*/

fun main() {
    println("total de eleitores: ")
    val eleitores = readLine()?.toInt()!!
    println("total de votos nulos: ")
    val votosNulos = readLine()?.toInt()!!
    println("total de votos brancos: ")
    val votosBrancos = readLine()?.toInt()!!
    println("total de votos validos: ")
    val votosValidos = readLine()?.toInt()!!

    val percentualNulos = percentual(votosNulos, eleitores)
    val percentualBrancos = percentual(votosBrancos, eleitores)
    val percentualValidos = percentual(votosValidos, eleitores)

    println("percentual de votos nulos %.1f".format(percentualNulos))
    println("percentual de votos brancos %.1f".format(percentualBrancos))
    println("percentual de votos validos %.1f".format(percentualValidos))
}

fun percentual(valorParcial: Int, valorTotal: Int): Double {
    return (valorParcial.toDouble() / valorTotal.toDouble()) *100
}

