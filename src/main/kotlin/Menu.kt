

open class Menu(private val consola: Consola):IMenu{

    override fun generarSerie() {
        GeneradorSeries.generarSerie()
        GestorMenu(consola).opciones()

    }

    override fun jugarAhorcado() {
        Ahorcado(consola).jugar()
        GestorMenu(consola).opciones()

    }

    override fun mostrarMenu() {
        consola.mostrar("1. Generar serie",true)
        consola.mostrar("2. Jugar al ahorcado",true)
        consola.mostrar("3. Salir",true)
        consola.mostrar("Por favor. seleciona una opción: ")



    }
}