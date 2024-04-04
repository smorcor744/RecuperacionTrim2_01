class Ahorcado:Consola() {
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

                Consola().mostrar("Adivina la palabra: ${espacios.joinToString(" ")}",true)

                val letra = Consola().leerLetra(Consola().mostrar("Intenta con una letra:", true).toString())

                if (letrasPalabras.contains(letra)) {
                    letrasPalabras.forEachIndexed { index, char ->
                        if (char == letra) {
                            espacios[index] = letra.toString()
                        }
                    }

                } else {
                    intentos--
                    Consola().mostrar("Incorrecto! Intentos restantes: $intentos",true )
                }
            }

            if ( intentos == 0){Consola().mostrar("Lo siento! Se acabaron tus intentos. La palabra era: \"$palabras\"",true)
                GestorMenu().opciones()

            }else {
                Consola().mostrar("¡Felicidades! Has adivinado la palabra: $palabras")
                GestorMenu().opciones()
            }

    }
}