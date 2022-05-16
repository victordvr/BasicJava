import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        int producto [][] = new int[11][11];
        int fila, columna;
        Scanner sc = new Scanner(System.in);
        //Quemando la tabla de multiplicar ilustrativa a imprimir
        for (int i = 0; i <= 11-1; i++) {
            if (i == 0) {
                for (int j = 0; j <= 11 - 1; j++) {
                    if (j == 0){
                        System.out.print(j + " |    ");
                    }else {
                        System.out.print(j + "   |   ");
                    }
                }
            }else if (i == 10){
                for (int j = 0; j <= 11-1; j++) {
                    if (j == 0) {
                        System.out.print(i + "|");
                    }else if (j == 1){
                        System.out.print(" " + i + " x " + j + " |");
                    }else {
                        System.out.print(i + " x " + j + " |");
                    }
                }
            }else {
                for (int j = 0; j <= 11-1; j++) {
                    if (j == 0){
                        System.out.print(i + " | ");
                    }else {
                        System.out.print(" " + i + " x " + j + " |");
                    }

                }
            }
            System.out.println(" ");
        }
        //Línea en blanco
        System.out.println(" ");
        //Llenando la matriz bidimensional producto con los respectivos resultados de multiplicaciones
        for (int i = 0; i <= producto.length-1; i++) {
            for (int j = 0; j <= producto.length-1; j++) {
                producto[i][j] = i * j;
            }
        }
        //Petición de la fila y columna para mostrar el resultado de la multiplicación deseada
        System.out.print("Ingresa número de fila como primer factor: ");
        fila = sc.nextInt();
        System.out.print("Ingresa número de columna como segundo factor: ");
        columna = sc.nextInt();
        System.out.print("Resultado de " + fila + " x " + columna + " = " + producto[fila][columna]);
    }
}
