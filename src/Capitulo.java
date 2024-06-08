public class Capitulo extends Video implements Visualizable{

    public Capitulo(String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto,
            Integer calificacion, Boolean visto, Integer temporadas, Object object) {
        super(titulo, genero, anio, duracion, tiempoVisto, 0, false, temporadas);
    
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
