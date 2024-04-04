class Ahorcado(private val consola: Consola) {
    fun jugar(){
        val palabra = obtenerPalabraAleatoria()
        val letrasPalabra = palabra.toList()
        val espacios : MutableList<String> = mutableListOf()
        for (letras in letrasPalabra){
            espacios.add("_")
        }
        juego(espacios,letrasPalabra,palabra)
    }


    private fun juego(espacios: MutableList<String>, letrasPalabras: List<Char>, palabras: String){
        var intentos :Int = 5

            while (espacios.contains("_") && intentos > 0) {

                consola.mostrar("Adivina la palabra: ${espacios.joinToString(" ")}",true)

                val letra = consola.leerLetra(consola.mostrar("Intenta con una letra:", true).toString())

                if (letrasPalabras.contains(letra)) {
                    letrasPalabras.forEachIndexed { index, char ->
                        if (char == letra) {
                            espacios[index] = letra.toString()
                        }
                    }

                } else {
                    intentos--
                    consola.mostrar("Incorrecto! Intentos restantes: $intentos",true )
                }
            }

            if ( intentos == 0){consola.mostrar("Lo siento! Se acabaron tus intentos. La palabra era: \"$palabras\"",true)
                GestorMenu(consola).opciones()

            }else {
                consola.mostrar("¡Felicidades! Has adivinado la palabra: $palabras")
                GestorMenu(consola).opciones()
            }

    }
}