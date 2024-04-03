import kotlin.random.Random


open class Menu(protected val consola:Consola):IMenu{

    override fun generarSerie() {
        GeneradorSeries(consola).generarSerie()

    }

    override fun jugarAhorcado() {
        TODO("Not yet implemented")
    }

    override fun mostrarMenu() {
        consola.mostrar("1. Generar serie",true)
        consola.mostrar("2. Jugar al ahorcado",true)
        consola.mostrar("3. Salir",true)
        consola.mostrar("Por favor. seleciona una opción: ")


    }
}