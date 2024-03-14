package evf.javadoc.original;

public class Artista {
    String nombreArtista;
    private int edad;

    public Artista(String nombreArtista, int edad) {
        this.nombreArtista = nombreArtista;
	this.edad = edad;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }

    public int getEdad() {
	return edad;
	// Manuel Arana
    }
    
}


