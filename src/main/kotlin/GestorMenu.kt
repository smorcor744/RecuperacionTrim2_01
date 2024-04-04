

class GestorMenu(private val consola: Consola):Menu(consola) {
    fun opciones(){
        val numero = consola.leerNum(mostrarMenu().toString())
        when (numero){
            1 -> generarSerie()
            2 -> jugarAhorcado()
            3 -> consola.mostrar("Saliendo...")
            else -> consola.mostrar("Numero no valido",true)
        }

    }
}