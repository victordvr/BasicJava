import java.util.Scanner;

public class TallerMotos {
    public static void main(String[] args) {
        String mechanical, service, annotationIn, annotationOut;
        String customer, document, motorcycle, cylinderCapacity;
        String option;
        Scanner input = new Scanner(System.in);

        System.out.println("Registro de servicios EL MAQUINISTA");
        System.out.println("Menú:");
        System.out.println("1. Registro de ingreso");
        System.out.println("2. Registro de salida");
        System.out.println("3. Búsqueda de servicio por documento del cliente");
        System.out.println("0. Salir");
        System.out.print("Ingresa opción: ");

        option = input.nextLine();
        switch (option){
            case "1":
                System.out.println("Registro de ingreso");
                System.out.print("Cliente: ");
                customer = input.nextLine();
                System.out.print("Documento de identificación: ");
                document = input.nextLine();
                System.out.print("Moto (marca y modelo): ");
                motorcycle = input.nextLine();
                System.out.print("Cilindraje: ");
                cylinderCapacity = input.nextLine();
                System.out.print("Observaciones: ");
                annotationIn = input.nextLine();
                break;
            case "2":
                System.out.println("Registro de salida");
                System.out.print("Mecánico que realizó el servicio: ");
                mechanical = input.nextLine();
                System.out.print("Servicios realizados, mencionando repuestos cambiados: ");
                service = input.nextLine();
                System.out.print("Observaciones adicionales: ");
                annotationOut = input.nextLine();
                break;
            case "3":
                System.out.println("Ingrese número de identificación del cliente para buscar información del servicio:");
                document = input.nextLine();
                break;
            case "0":
                System.out.println("Se cerró el menú");
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }
    }
}
