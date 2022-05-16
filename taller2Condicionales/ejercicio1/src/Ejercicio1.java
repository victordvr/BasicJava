import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        age = input.nextInt();

        if (age >= 18){
            System.out.println("Usted es mayor de edad.");
        }
    }
}
