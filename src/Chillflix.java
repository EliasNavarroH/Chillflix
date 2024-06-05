import java.util.Scanner;

public class Chillflix {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        int inicioPelicula = 0; 
        int inicioSerie = 0;

        Pelicula pelicula[] = new Pelicula[100]; //maximo de 100 peliculas
        Serie serie[] = new Serie[100];//maximo de 100 series
        
        while (true) {
        System.out.println("      CHILLFLIX      ");
        System.out.println("=====================");
        System.out.println("1.-Registrar Pelicula");
        System.out.println("2.-Registar Serie");
        System.out.println("3.-Registrar Capitulo");
        System.out.println("=====================");
        System.out.println("4.-Actualizar Pelicula");
        System.out.println("5.-Actualizar Serie");
        System.out.println("6.-Actualizar Capitulo");
        System.out.println("=====================");
        System.out.println("7.-Listados");
        System.out.println("=====================");
        System.out.println("9.-Salir");
        System.out.println("=====================");

            System.out.println("Elija una opcion:");
            opcion = input.nextInt();
            switch (opcion) { 
                case 1:
                pelicula[inicioPelicula] = registrarPelicula(input);
                inicioPelicula++;
                break;
                case 2:
                serie[inicioSerie] = registrarSerie(input);
                inicioSerie++;
                break;
                case 3:
                registrarCapitulo(input, inicioSerie, serie);
                break;
                case 4:
                System.out.println("");
                case 5:
                case 6:
                case 7:
                case 9:
                System.out.println("Hasta luego!");
                break;
            }
        }

    }

    public static Pelicula registrarPelicula(Scanner input){
        Pelicula pelicula = new Pelicula(null, null, null, null, null, null, null);
        System.out.println("Ingresa el titulo de la pelicula:");
        input.nextLine();
        pelicula.setTitulo(input.nextLine());
        System.out.println("Ingrese el genero de la pelicula");
        pelicula.setGenero(input.nextLine());
        System.out.println("El año de la misma: ");
        pelicula.setAnio(input.nextInt());
        System.out.println("La duracion en minutos: ");
        pelicula.setDuracion(input.nextInt());
        return pelicula;
    }

    public static Serie registrarSerie(Scanner input){
        Serie serie = new Serie(null, null, null, null, null, null, null, null);
        System.out.println("Ingresa el titulo de la serie: ");
        input.nextLine();
        serie.setTitulo(input.nextLine());
        System.out.println("Ingresa el genero: ");
        serie.setGenero(input.nextLine());
        System.out.println("El año de la serie: ");
        serie.setAnio(input.nextInt());
        System.out.println("La duracion de la mimsa: ");
        serie.setDuracion(input.nextInt());
        System.out.println("Ingrese la cantidad de temporadas: ");
        serie.setTemporadas(input.nextInt());
        serie.capitulos = new Capitulo[50];
        return serie;
    }

    public static Capitulo registrarCapitulo(Scanner input, Integer inicioSerie, Serie[] series){
        if (inicioSerie !=0) {
            System.out.println("A que Serie le quieres agregar capitulos ?");
            for(int i=0 ; i<inicioSerie ; i++){
                System.out.println(i+1 + ". " + series[i].toString());
            }
        }
        return capitulo;
    }


}
