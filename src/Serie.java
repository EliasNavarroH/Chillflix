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
       return " " + this.titulo + " | " + this.genero + " | " + this.anio + " | " ;
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
