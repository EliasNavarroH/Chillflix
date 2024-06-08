import java.util.Scanner;

public class Chillflix {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        int inicioPelicula = 0; 
        int inicioSerie = 0;
        Boolean menu = true;

        Pelicula pelicula[] = new Pelicula[100]; //se iniacializa el arreglo con un maximo de 100 peliculas
        Serie series[] = new Serie[100];//se inicializa el arreglo con un maximo de 100 series
        
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
                System.out.println("");
                case 5:
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

    public static Serie registrarSerie(Scanner input){
        // Se crea el metodo para registrar una serie.
        System.out.println("Ingresa el titulo de la serie: ");
        input.nextLine();
        String titulo = input.nextLine();
        System.out.println("Ingresa el genero: ");
        String genero = input.nextLine();
        System.out.println("El año de la serie: ");
        Integer anio = input.nextInt();
        System.out.println("La duracion de la mimsa: ");
        Integer duracion = input.nextInt();
        System.out.println("Ingrese la cantidad de temporadas: ");
        Integer temporadas = input.nextInt();
        Serie serie = new Serie(titulo, genero, anio, duracion, anio, duracion, null, temporadas);
        serie.capitulos = new Capitulo[50];
        return serie;
    }

    public static Capitulo registrarCapitulo(Scanner input, Integer inicioSerie, Serie[] series){
        if (inicioSerie == 0) {
            System.out.println("No tiene series registradas.");
            return null;
        }else{
            System.out.println("En que serie desea registrar capitulos ? ");
            for(int i = 0; i < inicioSerie ; i++ ){
                System.out.println(i+1 + ". " + series[i].toString());
            }
            System.out.println("Seleccione el numero de serie: ");
            Integer seleccionSerie = input.nextInt() - 1 ;

            if (seleccionSerie >= 0 && seleccionSerie <= inicioSerie) {
                Serie serieSeleccionada = series[seleccionSerie];
                Integer indice = -1;
                for(int i = 0 ; i < serieSeleccionada.capitulos.length ; i ++){
                    if (serieSeleccionada.getCapitulos()[i]== null) {
                        indice = i ;
                        break;
                    }
                }
                System.out.println("Ingresa el titulo del capitulo");
                input.nextLine();
                String tituloCapitulo = input.nextLine();
                String genero =  series[seleccionSerie].getGenero();
                Integer anio = series[seleccionSerie].getAnio();
                Integer duracion = series[seleccionSerie].getDuracion();
                // los parametros se pasan de la serie seleccionada exceptuando el titulo del capitulo
                Capitulo capitulo = new Capitulo(tituloCapitulo, genero, anio, duracion, duracion);
                serieSeleccionada.getCapitulos()[indice] = capitulo;
                System.out.println("Capitulo agregado en la serie: " + serieSeleccionada.getTitulo());
                return capitulo;
            }else{
                return null;
            }

        }

    }


}
