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

    public void agregarCapitulo(){
        capitulos = new Capitulo[temporadas][];
        for(int i = 0; i < temporadas ; i++){
            System.out.println("Ingrese el numero de capitulos para la temporada: " + (i +1));
            Integer cantCapitulos = input.nextInt();
            input.nextLine();
            capitulos [i] = new Capitulo[cantCapitulos];
            for(int j=0; j < cantCapitulos ; j++){
                Capitulo capitulo = new Capitulo(" ", "genero", 0, 0, 0);
                System.out.println("Ingresa el titulo del capitulo " + (j + 1));
                capitulo.setTitulo(input.nextLine());
                capitulo.setGenero(this.getGenero());
                System.out.println("Ingrese el año del capitulo: ");
                capitulo.setAnio(input.nextInt());
                System.out.println("Ingrese la duracion del capitulo(minutos):");
                capitulo.setDuracion(input.nextInt());
                input.nextLine();
                capitulos[i][j] = capitulo;
            }
        }
    }
    
}
