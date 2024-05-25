public class Capitulo extends Serie{
    String tituloCapitulo;
    
    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }

    public Capitulo(String titulo, String tituloCapitulo,String genero, Integer anio, Integer duracion, Integer tiempoVisto,
            Integer calificacion, Boolean visto, Integer temporadas) {
        super(titulo, genero, anio, duracion, tiempoVisto, calificacion, visto, temporadas);
        this.tituloCapitulo = tituloCapitulo;
    }
    
}
