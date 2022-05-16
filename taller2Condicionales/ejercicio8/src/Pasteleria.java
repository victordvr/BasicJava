import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {
        String sabor, decoracion, tortasDisponibles, tortasVendidas, precio, porciones;
        String opcion;
        Scanner input = new Scanner(System.in);
        tortasDisponibles = "15";

        System.out.println("Menú:");
        System.out.println("1. Tortas disponibles");
        System.out.println("2. Registro de pedido");
        System.out.println("3. Registro de venta");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.print("Ingresa una opción: ");

        opcion = input.nextLine();
        switch (opcion){
            case "1":
                System.out.print("Tortas disponibles: " + tortasDisponibles);
                break;
            case "2":
                System.out.println("Registrar pedido");
                System.out.print("Sabor: ");
                sabor = input.nextLine();
                System.out.print("Cantidad de porciones: ");
                porciones = input.nextLine();
                System.out.print("Decoraciones: ");
                decoracion = input.nextLine();
                System.out.println("Pedido registrado");
                break;
            case "3":
                System.out.println("Registrar venta");
                System.out.println("Tortas disponibles: " + tortasDisponibles);
                System.out.print("Cantidad de tortas vendidas: ");
                tortasVendidas = input.nextLine();
                int iTortasVendidas = Integer.parseInt(tortasVendidas);
                int iTortasDisponibles = Integer.parseInt(tortasDisponibles);
                if (iTortasVendidas <= iTortasDisponibles){
                    System.out.print("Precio por torta COP: ");
                    precio = input.nextLine();
                    float fprecio = Float.parseFloat(precio);
                    float total = iTortasVendidas * fprecio;
                    System.out.print("Total: $" + total + " COP");
                }else {
                    System.out.println("No hay " + iTortasVendidas + " tortas disponibles. En el momento hay " + iTortasDisponibles);
                }
                break;
            case "0":
                System.out.println("Salió de la aplicación");
                break;
            default:
                System.out.println("Ingrese una opción existente");
                break;
        }
    }
}
