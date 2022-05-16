import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre, apellidos;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tus apellidos: ");
        apellidos = entrada.nextLine();
        System.out.println("Hola " + nombre + " " + apellidos);
    }
}
