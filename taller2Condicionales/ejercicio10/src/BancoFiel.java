import java.util.Scanner;

public class BancoFiel {
    public static void main(String[] args) {
        String user, password, ingreso, retiro, option;
        double saldo = 1000000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a su Banco Fiel");
        System.out.print("Ingresa tu usuario: ");
        user = sc.nextLine();
        System.out.print("Ingresa tu clave: ");
        password = sc.nextLine();

        System.out.println("¿Qué deseas realizar hoy?");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar saldo");
        System.out.println("0. Salir");
        System.out.println("");

        System.out.print("Ingresa la opción que quieres: ");
        option = sc.nextLine();

        switch (option){
            case "1":
                System.out.println("Depositar dinero");
                System.out.print("Monto a depositar: $");
                ingreso = sc.nextLine();
                float fIngreso = Float.parseFloat(ingreso);
                if (fIngreso > 0){
                    saldo = saldo + fIngreso;
                    System.out.print("Depositaste: $" + fIngreso + "\n");
                    System.out.print("Saldo actual: $" + saldo + "\n");
                }else {
                    System.out.println("Ingresa un valor válido");
                }
                break;
            case "2":
                System.out.println("Retirar dinero");
                System.out.print("Monto a retirar: $");
                retiro = sc.nextLine();
                float fRetiro = Float.parseFloat(retiro);
                if (fRetiro <= saldo){
                    saldo = saldo - fRetiro;
                    System.out.print("Retiraste: $" + fRetiro + "\n");
                    System.out.print("Saldo actual: $" + saldo + "\n");
                }else{
                    System.out.println("Saldo insuficiente");
                    System.out.print("Saldo actual: $" + saldo + "\n");
                }
                break;
            case "3":
                System.out.println("Tu saldo es de: $" + saldo);
                break;
            case "0":
                System.out.println("Sesión cerrada");
                break;
            default:
                System.out.println("Elige una opción válida");
                break;
        }
    }
}
