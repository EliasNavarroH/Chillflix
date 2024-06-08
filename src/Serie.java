import java.util.Scanner;

public class Serie extends Video{

    Scanner input = new Scanner(System.in);
    private Integer temporadas;
    private Capitulo[][] capitulos;

    
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
    public String toString(){
       return " " + this.titulo + " | " + this.genero + " | " + this.anio + " | " + " Duracion (minutos) + " + this.duracion + " | " + " Calificacion: " + this.calificacion ;
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
