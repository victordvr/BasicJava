import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String name, lastName;
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        name = input.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        lastName = input.nextLine();
        System.out.print("Ingrese su edad: ");
        age = input.nextInt();

        if (age >= 18){
            System.out.println(name + " " + lastName + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        } else{
            System.out.println(name + " " + lastName + " usted es menor de edad, por lo tanto no puede entrar a la fiesta," +
                    "devuélvase a su casa");
        }
    }
}
