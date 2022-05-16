import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        String option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de áreas geométricas");
        System.out.println("1. Calcular área del triángulo");
        System.out.println("2. Calcular área del rectángulo");
        System.out.println("3. Calcular área del trapecio");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.print("Ingrese la opción que desee: ");
        option = sc.nextLine();

        switch (option){
            case "1":
                Triangulo triangulo = new Triangulo();
                triangulo.area();
                break;
            case "2":
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.area();
                break;
            case "3":
                Trapecio trapecio = new Trapecio();
                trapecio.area();
                break;
            case "0":
                System.out.println("Salió de la aplicación");
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }
    }
}
