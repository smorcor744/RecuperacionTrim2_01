class Ahorcado(private val consola: Consola) {
    fun jugar(){
        val palabra = obtenerPalabraAleatoria()
        consola.mostrar("Adivina la palabra: ${palabra}")
    }
}