import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre, apellidos;
        int edad;
        float altura;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tus apellidos: ");
        apellidos = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingresa tu estatura [m]: ");
        altura = entrada.nextFloat();

        System.out.println("Hola " + nombre + " " + apellidos + ". Sabemos que tienes " + edad + " años y mides " + altura + " metros.");


    }
}
