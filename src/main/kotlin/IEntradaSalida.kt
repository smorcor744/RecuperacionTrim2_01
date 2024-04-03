interface IEntradaSalida {
    fun mostrar(mensaje: String, salto:Boolean = false)

    fun leerNum(mensaje: String):Int

    fun leer(): String
}