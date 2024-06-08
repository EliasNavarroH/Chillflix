public class Pelicula extends Video implements Visualizable {

    public Pelicula(String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto) {
        super(titulo, genero, anio, duracion, tiempoVisto);
        //TODO Auto-generated constructor stub
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
    @Override
    public String toString(){
       return " " + this.titulo + " | " + this.genero + " | " + this.anio + " | " + this.tiempoVisto +" | " + this.calificacion ;
    }
}
