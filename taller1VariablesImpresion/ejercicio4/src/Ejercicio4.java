import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String capital, pais;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una ciudad capital de un país: ");
        capital = entrada.nextLine();
        System.out.print("Ingrese el país al que pertenece dicha capital: ");
        pais = entrada.nextLine();

        System.out.println("La ciudad " + capital + ", es la capital del país " + pais);
    }
}
