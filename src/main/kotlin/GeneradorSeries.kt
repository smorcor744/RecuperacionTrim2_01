import kotlin.random.Random

object GeneradorSeries {
    private var max = 0
    private var min = 0


    private fun generarRangoAleatorio(){
        while (min +30 > max){
            max =  Random.nextInt(1,100)
            min =  Random.nextInt(1,100)
        }
    }

    fun generarSerie(){
        generarRangoAleatorio()
        var num = 0
        while (num in (max + 1)..<min) {
             num = Consola().leerNum(Consola().mostrar("Inserte un número [$min-$max] -> ").toString())
        }
        if (max - num < num -min){
            serieCreciente(num)
        }else serieDecreciente(num)
    }


    private fun serieCreciente(numero:Int){
        var num=numero
        var intervalo = 1
        val suma: MutableList<Int> = mutableListOf(num)
        var total = num
        Consola().mostrar("$num (0)",true)
        num++

        while (num != max){
            suma.add(num)

            val sumaStr = suma.joinToString("+")
            Consola().mostrar(sumaStr)


            Consola().mostrar(" ($intervalo)",true)
            total += suma.sumOf { it }
            num++
            intervalo++
        }

        Consola().mostrar("Suma => $total",true)

    }

    private fun serieDecreciente(numero : Int){
        var num=numero
        var intervalo = 1
        val suma: MutableList<Int> = mutableListOf()
        var total = 0
        var num2 = numero

        while (num2 != min){
            suma.add(num2)
            num2--
            total += num2
        }

        while (num != min){
            suma.sumOf { it }

            if (intervalo < 10) {
                Consola().mostrar("0$intervalo -> ")
            }else Consola().mostrar("$intervalo -> ")

            val sumaStr = suma.joinToString("+")
            Consola().mostrar(sumaStr)

            Consola().mostrar(" = $total", true)
            suma.removeLast()
            total = suma.sumOf { it }
            num--
            intervalo++
        }

    }
}


