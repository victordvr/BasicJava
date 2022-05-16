import java.util.Scanner;

public class VideoTienda {
    public static void main(String[] args) {
        String user, movie, annotation, option;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenid@ a nuestra video tienda virtual.");
        System.out.print("Usuario: ");
        user = input.nextLine();
        System.out.print("Hola, " + user);
        //Menú
        System.out.println("");
        System.out.println("1. Consultar y ver trailer de películas disponibles");
        System.out.println("2. Alquilar película");
        System.out.println("3. Recibir película en la video tienda física");
        System.out.println("4. Comentarios, novedades o reporte de daño de la película");
        System.out.println("0. Salir");

        System.out.print("Elige una opción:");
        option = input.nextLine();
        switch (option){
            case "1":
                System.out.println("Busca la película para confirmar disponibilidad");
                movie = input.nextLine();
                System.out.println(movie + " disponible");
                break;
            case "2":
                System.out.println("Película confirmada para: " + user);
                break;
            case "3":
                System.out.println("La película se entregará en la video tienda física. Si lo prefieres se puede entregar" +
                        " a domicilio por un costo adicional");
                break;
            case "4":
                System.out.println("Escribe las novedades o daños presentados:");
                annotation = input.nextLine();
                System.out.println("Gracias por la información, de ser necesario nos comunicaremos pronto");
                break;
            case "0":
                System.out.println("Gracias por visitarnos");
                break;
            default:
                System.out.println("Elige una opción existente");
                break;
        }
    }
}
