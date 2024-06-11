import java.util.Scanner;

public class Capitulo extends Video{
    String tituloCapitulo;
    Scanner input = new Scanner(System.in);
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
            System.out.println("Ya calificaste este capitulo");
        }else{
            System.out.println("Ingresa una calificacion valida. ");
        }
        return this.calificacion;
       
    }

    
}
