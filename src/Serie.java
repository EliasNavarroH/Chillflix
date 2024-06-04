public class Serie extends Video{
    Integer temporadas;

    
    public Serie(String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto,
            Integer calificacion, Boolean visto, Integer temporadas) {
        super(titulo, genero, anio, duracion, tiempoVisto, calificacion, visto, temporadas);
        this.temporadas = temporadas;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString(){
       return "Nombre de la serie : " + this.titulo + " ";
    }
    
}
