

class GestorMenu(consola: Consola):Menu(consola) {
    fun opciones(){
        val numero = consola.leerNum(mostrarMenu().toString())
        when (numero){
            1 -> generarSerie()
            2 -> jugarAhorcado()
            3 -> consola.mostrar("Saliendo del programa...")
            else -> consola.mostrar("Numero no valido",true)
        }

    }
}