import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre, nombreMascota, mascota;
        int edadMascota;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el nombre de su mascota: ");
        nombreMascota = entrada.nextLine();
        System.out.print("¿Qué tipo de mascota es?: ");
        mascota = entrada.nextLine();
        System.out.print("¿Cuál es la edad de su mascota?: ");
        edadMascota = entrada.nextInt();

        System.out.println(nombreMascota + " es un(a) " + mascota + ", el cual tiene " + edadMascota + " años de edad y " +
                nombre + " es actualmente su dueño(a).");
    }
}
