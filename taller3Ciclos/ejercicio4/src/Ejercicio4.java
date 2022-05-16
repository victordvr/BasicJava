import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int number, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        System.out.print("Digita el número del cual deseas ver la tabla de multiplicar: ");
        number = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
