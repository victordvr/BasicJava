import java.util.Scanner;

public class EscuelaConduccion {
    public static void main(String[] args) {
        String user, option, confirm;
        int numberUser = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ESCUELA AUTOMOVILÍSTICA EL MAESTRO");
            System.out.println("1. Ingreso al curso");
            System.out.println("2. Consultar usuario");
            System.out.println("3. Resultados del curso");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Ingresa una opción: ");

            option = sc.nextLine();
            switch (option){
                case "1":
                    if (numberUser < 8){
                        System.out.println("REGISTRA TU INGRESO AL CURSO");
                        System.out.print("Usuarios actuales: " + numberUser + "\n");
                        System.out.print("Escribe un nombre de usuario: ");
                        user = sc.nextLine();
                        if (!user.equals("")){
                            numberUser = numberUser + 1;
                            System.out.println("Usuario creado con éxito");
                            System.out.print("Presiona ENTER para continuar: ");
                            confirm = sc.nextLine();
                        }else {
                            System.out.println("No se ha registrado el usuario");
                            System.out.print("Presiona ENTER para continuar: ");
                            confirm = sc.nextLine();
                        }
                    }else {
                        System.out.println("No se puede registrar el usuario, debe de esperar que se abran cupos");
                        System.out.print("Usuarios actuales: " + numberUser + "\n");
                        System.out.print("Presione ENTER para continuar: ");
                        confirm = sc.nextLine();
                    }
                    break;
                case "2":
                    System.out.println("CONSULTAR USUARIO");
                    System.out.print("Ingresa usuario: ");
                    user = sc.nextLine();
                    System.out.println("El usuario se encuentra en nuestra base de datos. Un correo informativo ha sido enviado.");
                    System.out.print("Presiona ENTER para continuar:");
                    confirm = sc.nextLine();
                    break;
                case "3":
                    System.out.println("CONSULTA DE RESULTADOS");
                    System.out.print("Ingresa usuario: ");
                    user = sc.nextLine();
                    System.out.println("El estado de aprobación del curso ha sido enviado al correo registrado del usuario.");
                    System.out.print("Presiona ENTER para continuar: ");
                    confirm = sc.nextLine();
                    break;
                case "0":
                    System.out.println("Salió del sistema");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;

            }

        }while (!option.equals("0"));
    }
}
