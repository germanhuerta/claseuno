package cl.duoc.cinehoytsmarkplanet.DTO;

public class PeliculaDTO {

    private static int Contid = 1;  // Variable para contar el ID
    private String Titulo;
    private String Director;
    private String Anio;
    private String Duracion;
    private String Genero;
    private int id;
    
    public PeliculaDTO(String Titulo, String Director, String Anio, String Duracion, String Genero, int id) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Anio = Anio;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.id = Contid++;
    }

    public PeliculaDTO() {
        this.Titulo = "";
        this.Director = "";
        this.Anio = "";
        this.Duracion = "";
        this.Genero = "";
        this.id = Contid++;
    } 
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return  "id:"+ this.id + "\n"
                + "Pelicula: " + this.Titulo + "\n"
                + "Director: " + this.Director + "\n"
                + "Categoria: " + this.Genero + "\n"
                + "Duracion: " + this.Duracion + "\n"
                + "Año: " + this.Anio + "\n";
                
    }
}
