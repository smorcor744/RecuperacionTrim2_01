interface IEntradaSalida {
    fun mostrar(mensaje: String, salto:Boolean = false)

    fun leerNum(mensaje: String):Int

    fun leerLetra(mensaje: String):Char


    fun leer(): String
}