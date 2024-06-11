import java.util.Scanner;

public class Pelicula extends Video {

    Scanner input = new Scanner(System.in);

    public Pelicula(
            String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto) {
        super(titulo, genero, anio, duracion, tiempoVisto);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return " "+ this.titulo+ " | "+ this.genero+ " | "+ this.anio+ " |  Duracion: "+ this.duracion;
    }

    @Override
    public int tiempoVisto() {
        System.out.println("El tiempo visto actual de: " + this.titulo + " es de " + this.tiempoVisto + " minutos");
        System.out.println("Ingresa en minutos el tiempo visto:  ");
        Integer vistoActual = (input.nextInt());
        if (vistoActual > this.duracion) {
            System.out.println(" El tiempo visto ingresado es mayor a la duracion de la pelicula. ");
        } else if (vistoActual >= (this.duracion * 0.9)) {
            System.out.println(this.getTitulo() + " Transferida a la seccion de Finalizadas");
            System.out.println("Viste " + vistoActual / 60 + "h, " + vistoActual % 60 + "m de " + (this.duracion / 60)
                    + "h, " + (this.duracion % 60) + "m de " + this.getTitulo());
            this.visto = true;
        } else {
            System.out.println("Viste " + vistoActual / 60 + "h, " + vistoActual % 60 + "m de " + (this.duracion / 60)
                    + "h, " + (this.duracion % 60) + "m de " + this.getTitulo());
        }
        return this.tiempoVisto = vistoActual;
    }

    @Override
    public int ponerCalificacion() {
        System.out.println("Ingresa la calificación (1-10) para " + this.titulo + ": ");
        int calificacion = input.nextInt();
        if (calificacion > 0 && calificacion <= 10 || this.calificacion != 0) {
            this.setCalificacion(calificacion);
        }else if (this.calificacion != 0) {
            System.out.println("Ya calificaste esta pelicula");
        }else{
            System.out.println("Ingresa una calificacion valida. ");
        }
        return this.calificacion;
       
    }

}
