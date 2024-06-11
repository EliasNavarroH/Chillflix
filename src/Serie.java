import java.util.Scanner;

public class Serie extends Video {

    Scanner input = new Scanner(System.in);
    private Integer temporadas;
    private Capitulo[][] capitulos;
    private Integer capitulosTotales = 0;

    public Integer getCapitulosTotales() {
        return capitulosTotales;
    }

    public void setCapitulosTotales(Integer capitulosTotales) {
        this.capitulosTotales = capitulosTotales;
    }

    public Serie(String titulo, String genero, Integer anio, Integer duracion, Integer tiempoVisto,
            Integer calificacion, Boolean visto, Integer temporadas) {
        super(titulo, genero, anio, duracion, tiempoVisto);
        this.temporadas = temporadas;
        this.capitulos = new Capitulo[temporadas][];
    }

    public Capitulo[][] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[][] capitulos) {
        this.capitulos = capitulos;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return " " + this.titulo + " | " + this.genero + " | " + this.anio + " | " + " Duracion (minutos) "
                + this.duracion;
    }

    @Override
    public int tiempoVisto() {
        System.out.println("El tiempo visto actual de: " + this.titulo + " es de " + this.tiempoVisto + " minutos");
        System.out.println("Ingresa en minutos el tiempo visto:  ");
        Integer vistoActual = (input.nextInt());
        if (vistoActual > this.duracion) {
            System.out.println(" El tiempo visto ingresado es mayor a la duracion de la serie. ");
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
        } else if (this.calificacion != 0) {
            System.out.println("Ya calificaste esta serie");
        } else {
            System.out.println("Ingresa una calificacion valida. ");
        }
        return this.calificacion;

    }

    public void agregarCapitulo() {
        capitulos = new Capitulo[temporadas][];
        for (int i = 0; i < temporadas; i++) {
            System.out.println("Ingrese el numero de capitulos para la temporada: " + (i + 1));
            Integer cantCapitulos = input.nextInt();
            input.nextLine();
            capitulos[i] = new Capitulo[cantCapitulos];
            for (int j = 0; j < cantCapitulos; j++) {
                Capitulo capitulo = new Capitulo(" ", "genero", 0, 0, 0);
                System.out.println("Ingresa el titulo del capitulo " + (j + 1));
                capitulo.setTitulo(input.nextLine());
                System.out.println("Ingrese el año del capitulo: ");
                capitulo.setAnio(input.nextInt());
                System.out.println("Ingrese la duracion del capitulo(minutos):");
                capitulo.setDuracion(input.nextInt());
                input.nextLine();
                capitulo.setGenero(this.getGenero());
                capitulos[i][j] = capitulo;
                capitulosTotales++;
            }
        }
    }


}
