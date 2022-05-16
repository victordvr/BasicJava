import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menú de usuario");
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            System.out.println("");
            System.out.print("Ingresa una opción: ");
            option = sc.nextInt();
        }while (option != 3);
    }
}
