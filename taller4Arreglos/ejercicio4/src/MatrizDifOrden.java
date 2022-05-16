public class MatrizDifOrden {
    public static void main(String[] args) {
        //Declaro variable y matriz
        int number = 1;
        int matriz[][] = new int[4][5];
        //Quemo la matriz bidimensional con números del 1 al 20
        for (int i = 0; i <= 4-1; i++) {
            for (int j = 0; j <= 5-1; j++) {
                matriz[i][j] = number;
                number++;
            }
        }
        //Imprimo la matriz quemada
        for (int i = 0; i <= 4-1; i++) {
            for (int j = 0; j <= 5-1; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz con filas 1 y 3 cambiadas de órden");
        System.out.println("");
        //Imprimo la matriz con diferente órden en 2 de sus filas
        for (int i = 0; i <= 4-1; i++) {
            if (i == 0 || i == 2){
                for (int j = 0; j <= 5-1; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
            }else {
                for (int j = 5-1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
