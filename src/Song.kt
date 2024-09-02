/*Imagina que necesitas crear una app de reproducción de música.

Crea una clase que pueda representar la estructura de una canción. La clase Song debe incluir estos elementos de código:

Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones
Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000, considera que es poco popular)
Un método para imprimir la descripción de una canción en este formato:
"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".*/


class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int
) {

    private val isPopular: Boolean get() = playCount >= 1000

    fun songDescription() {
        println("$title, interpretada por $artist, se lanzó el año $yearPublished.")
        if (isPopular) println("¡Esta canción es muy popular!.")
    }
}

fun main() {
    val newSong = Song("Viva la vida", "Coldplay", 2008, 928_800_000)
    newSong.songDescription()
}

