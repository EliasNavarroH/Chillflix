public class Serie extends Video{
    Integer temporadas;
    Capitulo[] capitulos = new Capitulo[100];

    
    public Serie(String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto,
            Integer calificacion, Boolean visto, Integer temporadas) {
        super(titulo, genero, anio, duracion, tiempoVisto, calificacion, visto, temporadas);
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
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
