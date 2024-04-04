
open class Consola: IEntradaSalida {

    override fun mostrar(mensaje: String, salto:Boolean){
        if(salto) println(mensaje) else print(mensaje)
    }

    override fun leer(): String {
        return readln()
    }

    override fun leerLetra(mensaje: String): Char {
        var letra: String
        while (true) {
            mostrar(mensaje)
            letra = readln()
            if (letra.length == 1)
                return letra[0]
        }
    }



    override fun leerNum(mensaje: String): Int {
        var num: Int
        while (true) {
            try {
                mostrar(mensaje)
                num = readln().toInt()
                break
            } catch (e: NumberFormatException) {
                mostrar("Por favor, introduce un número válido.\n")
            }
        }
        return num
    }


}