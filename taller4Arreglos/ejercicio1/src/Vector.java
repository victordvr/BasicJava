import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int vector[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresarás 5 números enteros para llenar un vector de 5 elementos.");
        //ciclo for para ingreso de datos solicitados al usuario
        for (int i = 0; i <= 4; i++) {
            System.out.print("Ingresa un número: ");
            vector[i] = sc.nextInt();
        }
        //ciclo for para impresión del vector
        for (int i = 0; i <= 4; i++) {
            System.out.println("[" + i + "] = " + vector[i]);
        }

    }
}
