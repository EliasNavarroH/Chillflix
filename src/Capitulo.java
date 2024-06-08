public class Capitulo extends Video implements Visualizable{
    String tituloCapitulo;


    public Capitulo(String titulo, String genero, Integer anio, Integer duracion, Integer calificacion) {
        super(titulo, genero, anio, duracion, null);
        //TODO Auto-generated constructor stub
    }
    
    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }

    @Override
    public int tiempoVisto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tiempoVisto'");
    }

    @Override
    public int ponerCalificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ponerCalificacion'");
    }
    
}
