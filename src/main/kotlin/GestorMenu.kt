

class GestorMenu:Menu() {
    fun opciones(){
        val numero = Consola().leerNum(mostrarMenu().toString())
        when (numero){
            1 -> generarSerie()
            2 -> jugarAhorcado()
            3 -> Consola().mostrar("Saliendo...")
            else -> Consola().mostrar("Numero no valido",true)
        }

    }
}