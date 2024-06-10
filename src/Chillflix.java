import java.util.Scanner;

public class Chillflix {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        int inicioPelicula = 0; 
        int inicioSerie = 0;
        Boolean menu = true;

        final Pelicula pelicula[] = new Pelicula[100]; //se iniacializa el arreglo con un maximo de 100 peliculas
        final Serie series[] = new Serie[100];//se inicializa el arreglo con un maximo de 100 series
        
        while (menu) {
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
                series[inicioSerie] = registrarSerie(input);
                inicioSerie++;
                break;
                case 3:
                registrarCapitulo(input, inicioSerie, series);
                break;
                case 4:
                actualizarPelicula(input, inicioPelicula, pelicula);
                break;
                case 5:
                actualizarSerie(input, inicioSerie, series);
                break;
                case 6:
                case 7:
                case 9:
                System.out.println("Hasta luego!");
                menu = false;
                break;
            }
        }

    }

    public static Pelicula registrarPelicula(Scanner input){
        // Se crea el metodo para registrar las peliculas
        System.out.println("Ingresa el titulo de la pelicula:");
        input.nextLine();
        String titulo = input.nextLine();
        System.out.println("Ingrese el genero de la pelicula");
        String genero = input.nextLine();
        System.out.println("El año de la misma: ");
        Integer anio = input.nextInt();
        System.out.println("La duracion en minutos: ");
        Integer duracion = input.nextInt();
        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion, 0); 
        return pelicula;
        }
        
    public static Pelicula actualizarPelicula(Scanner input, Integer inicioPelicula, Pelicula[] peliculas) {
            if (inicioPelicula == 0) {
                System.out.println("No hay películas registradas.");
                return null;
            }
        
            System.out.println("¿Qué película desea actualizar?");
            for (int i = 0; i < inicioPelicula; i++) {
                if (peliculas[i] != null) {
                    System.out.println((i + 1) + ". " + peliculas[i].toString());
                } else {
                    System.out.println((i + 1) + ". Película no inicializada");
                }
            }
        
            System.out.println("Seleccione el número de la película: ");
            Integer peliculaElegida = input.nextInt() - 1;  // Ajustar para índice base 0
        
            if (peliculaElegida >= 0 && peliculaElegida < inicioPelicula && peliculas[peliculaElegida] != null) {
                System.out.println("Elegiste: " + peliculas[peliculaElegida].getTitulo());
                System.out.println("¿Qué deseas hacer?");
                System.out.println("1) Actualizar tiempo visto");
                System.out.println("2) Calificar película");
        
                Integer opcion = input.nextInt();
        
                if (opcion < 1 || opcion > 2) {
                    System.out.println("Ingrese una opción válida.");
                } else {
                    switch (opcion) {
                        case 1:
                            peliculas[peliculaElegida].tiempoVisto();
                            break;
                        case 2:
                            peliculas[peliculaElegida].ponerCalificacion();
                            break;
                        default:
                            break;
                    }
                }
            } else {
                System.out.println("Número de película seleccionado inválido.");
            }
        
            return null;
    }
        
    public static Serie registrarSerie(Scanner input){
        // Se crea el metodo para registrar una serie.
        Serie serie = new Serie("null", "null", 0, 0, 0, 0, null, 0);
        System.out.println("Ingresa el titulo de la serie: ");
        input.nextLine();
        serie.setTitulo(input.nextLine());
        System.out.println("Ingresa el genero: ");
        serie.setGenero(input.nextLine());
        System.out.println("El año de la serie: ");
        serie.setAnio(input.nextInt());
        System.out.println("La duracion de la misma en minutos: ");
        serie.setDuracion(input.nextInt());
        System.out.println("Ingrese la cantidad de temporadas: ");
        serie.setTemporadas(input.nextInt());
        return serie;
    }

    public static Serie actualizarSerie(Scanner input, Integer inicioSerie, Serie[] series){
        if (inicioSerie == 0) {
            System.out.println("No hay series cargadas para actualizar.");
        }else{
            System.out.println("Que serie desea actualizar ? ");
            for(int i = 0 ;i<inicioSerie; i++ ){
                System.out.println(i + 1 + ". " + series[i]);
            }
            Integer serieElegida = input.nextInt()-1;

            if (serieElegida >= 0 && serieElegida < inicioSerie) {
                System.out.println("La serie elegida es: " + series[serieElegida].getTitulo());
                System.out.println("Que deseas actualizar ?");
                System.out.println("1) Actualizar tiempo visto");
                System.out.println("2) Calificar serie");
                Integer opcion = input.nextInt();
                if (opcion > 2) {
                    System.out.println("Ingrese una opcion valida");
                }else{
                    switch (opcion) {
                        case 1:
                            series[serieElegida].tiempoVisto();
                            break;
                        case 2:
                            series[serieElegida].ponerCalificacion();
                            break;
                    }
                }
            }
        }
        return null;
    }

    public static void registrarCapitulo(Scanner input, Integer inicioSerie, Serie[] series){
        System.out.println("A que series deseas cargar capitulos ?");
        for (int i = 0; i < inicioSerie; i++) {
            System.out.println(i+1 + ". " + series[i].getTitulo());
        }
        input.nextLine();
        Integer seleccionSerie = input.nextInt()-1;
        input.nextLine();
        if (seleccionSerie >= 0 && seleccionSerie < inicioSerie) {
            series[seleccionSerie].agregarCapitulo();
        }
    }     

}
