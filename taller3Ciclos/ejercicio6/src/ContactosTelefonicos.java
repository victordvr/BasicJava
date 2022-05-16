import java.util.Scanner;

public class ContactosTelefonicos {
    public static void main(String[] args) {
        String nombre, telefono, organizacion;
        String option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("CONTACTOS");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Ingresa una opción: ");

            option = sc.nextLine();
            switch (option){
                case "1":
                    System.out.println("Agregar contacto");
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    telefono = sc.nextLine();
                    System.out.print("Organización: ");
                    organizacion = sc.nextLine();
                    System.out.println("Contacto agregado exitosamente");
                    break;
                case "2":
                    System.out.println("Buscar contacto");
                    System.out.print("Nombre de contacto: ");
                    nombre = sc.nextLine();
                    break;
                case "3":
                    System.out.println("Eliminar contacto");
                    System.out.print("Nombre de contacto a eliminar: ");
                    nombre = sc.nextLine();
                    System.out.println("Contacto eliminado exitosamente");
                    break;
                case "0":
                    System.out.println("Cerró la aplicación");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }


        }while (!option.equals("0"));



    }
}
