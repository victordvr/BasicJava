import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre, apellidos;
        String nombrePadre, apellidosPadre, nombreMadre, apellidosMadre;
        Scanner entrada = new Scanner(System.in);
        //información propia
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tus apellidos: ");
        apellidos = entrada.nextLine();
        //información del padre
        System.out.print("Ingresa el nombre de tu padre: ");
        nombrePadre = entrada.nextLine();
        System.out.print("Ingresa los apellidos de tu padre: ");
        apellidosPadre = entrada.nextLine();
        //información de la madre
        System.out.print("Ingresa el nombre de tu madre: ");
        nombreMadre = entrada.nextLine();
        System.out.print("Ingresa los apellidos de tu madre: ");
        apellidosMadre = entrada.nextLine();

        System.out.println("Yo "+nombre+" "+apellidos+", soy hijo de "+nombreMadre+" "+apellidosMadre+" y de "+nombrePadre+" "+apellidosPadre+".");
    }
}
