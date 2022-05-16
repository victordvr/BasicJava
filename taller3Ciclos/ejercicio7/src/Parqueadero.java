import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        String nombre, telefono, marca, placa, autoIn, autoOut, confirm;
        int disponibilidad = 5;
        String option;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("PARQUEADERO EL GUARDIÁN");
            System.out.println("1. Ingreso de vehículo");
            System.out.println("2. Salida de vehículo");
            System.out.println("3. Consulta de vehículo");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Ingresa una opción: ");
            option = sc.nextLine();

            switch (option){
                case "1":
                    System.out.println("Ingreso de vehículo");
                    if (disponibilidad > 0) {
                        System.out.print("Parqueaderos disponibles: " + disponibilidad + "\n");
                        System.out.print("Nombre del cliente: ");
                        nombre = sc.nextLine();
                        System.out.print("Teléfono: ");
                        telefono = sc.nextLine();
                        System.out.print("Marca de carro: ");
                        marca = sc.nextLine();
                        System.out.print("Placa: ");
                        placa = sc.nextLine();
                        disponibilidad = disponibilidad - 1;
                        System.out.println("");
                    }else {
                        System.out.println("No hay parqueadero disponible");
                        System.out.println("");
                    }
                    break;
                case "2":
                    System.out.println("Salida de vehículo");
                    System.out.print("Ingrese nombre del dueño del vehículo: ");
                    nombre = sc.nextLine();
                    System.out.println("Presione ENTER para confirmar salida:");
                    confirm = sc.nextLine();
                    System.out.println("Salida autorizada");
                    if (disponibilidad < 5){
                        disponibilidad = disponibilidad + 1;
                    }
                    System.out.print("Parqueaderos disponibles: " + disponibilidad + "\n");
                    break;
                case "3":
                    System.out.println("Consulta de vehículo");
                    System.out.print("Ingrese nombre del dueño del vehículo: ");
                    nombre = sc.nextLine();
                    System.out.println("El vehículo se encuentra en el parqueadero");
                    System.out.println("Presione ENTER para confirmar");
                    confirm = sc.nextLine();
                    break;
                case "0":
                    System.out.println("Aplicación cerrada");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }while (!option.equals("0"));
    }
}
