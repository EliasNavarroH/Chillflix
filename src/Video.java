public abstract class Video {
    String titulo, genero;
    Integer anio, duracion, tiempoVisto, calificacion;
    Boolean visto;

    
    public Video(String titulo, String genero, Integer anio, Integer duracion, Integer calificacion){
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
        this.tiempoVisto = 0;
        this.calificacion = null;
        this.visto = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public Integer getTiempoVisto() {
        return tiempoVisto;
    }
    public void setTiempoVisto(Integer tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }
    public Integer getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
    public Boolean getVisto() {
        return visto;
    }
    public void setVisto(Boolean visto) {
        this.visto = visto;
    }

    
}
