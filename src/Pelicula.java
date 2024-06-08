import java.util.Scanner;

public class Pelicula extends Video {

    Scanner input = new Scanner(System.in);

    public Pelicula(String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto) {
        super(titulo, genero, anio, duracion, tiempoVisto);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString(){
       return " " + this.titulo + " | " + this.genero + " | " + this.anio + " |  Duracion: " + this.duracion +" |  Calificacion: " + this.calificacion ;
    }

    @Override
    public int tiempoVisto() {
        System.out.println("El tiempo visto actual de: " + this.titulo + " es de " + this.tiempoVisto + " minutos");
        System.out.println("Ingresa en minutos el tiempo visto:  ");
        this.setTiempoVisto(input.nextInt());
        return this.tiempoVisto;
    }

    @Override
    public int ponerCalificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ponerCalificacion'");
    }
}
