import java.util.Scanner;

public class MenuDrogueria {
    public static void main(String[] args) {
        String user, product, option;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenid@ a droguería Mi Salud!");
        System.out.print("Usuario: ");
        user = input.nextLine();
        System.out.println("Hola " + user + ", elige una opción:");
        System.out.println("1. Compra de producto");
        System.out.println("2. Consulta de precios");
        System.out.println("3. Devoluciones");
        System.out.println("0. Salir");

        option = input.nextLine();
        switch (option){
            case "1":
                System.out.print("Busca el producto que deseas: ");
                product = input.nextLine();
                System.out.print(product + " tiene las siguientes especificaciones: abc");
                break;
            case "2":
                System.out.print("Busca el producto a consultar precio: ");
                product = input.nextLine();
                System.out.print(product + " tiene un costo de $xxxx COP");
                break;
            case "3":
                System.out.println("En este momento esta opción virtual está en mantenimiento, por favor comunícate" +
                        " a la línea directa de devoluciones 604xxxxxxx");
                break;
            case "0":
                System.out.println("Gracias por visitar droguería MI SALUD, siempre será un gusto");
                break;
            default:
                System.out.println("Ingresa una opción existente");
                break;
        }
    }
}
