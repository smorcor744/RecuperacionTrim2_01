import kotlin.random.Random


open class Menu():IMenu, Consola(){

    override fun generarSerie() {
        GeneradorSeries.generarSerie()
        GestorMenu().opciones()

    }

    override fun jugarAhorcado() {
        Ahorcado().jugar()
        GestorMenu().opciones()

    }

    override fun mostrarMenu() {
        Consola().mostrar("1. Generar serie",true)
        Consola().mostrar("2. Jugar al ahorcado",true)
        Consola().mostrar("3. Salir",true)
        Consola().mostrar("Por favor. seleciona una opción: ")



    }
}