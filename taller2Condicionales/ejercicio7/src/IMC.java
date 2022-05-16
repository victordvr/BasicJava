import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double weight, height, imc;
        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA IMC");
        System.out.print("Peso [kg]: ");
        weight = input.nextFloat();
        System.out.print("Estatura [m]: ");
        height = input.nextFloat();
        System.out.println("");
        imc = weight / (Math.pow(height, 2));
        System.out.print("Su Índice de Masa Corporal IMC es: " + imc);
        System.out.println("");

        if (imc < 18.5){
            System.out.println("Bajo peso");
        }else if (18.5 <= imc && imc <= 24.9){
            System.out.println("Peso normal");
        }else if (25.0 <= imc && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidad");
        }
    }
}
