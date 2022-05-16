import java.util.ArrayList;
public class VectorNumAleatorios {
    public static void main(String[] args) {
        //declaración de variable, vector y arreglos de pares e impares
        int division;
        Integer vector[] = new Integer[20];
        ArrayList<Integer> numPares = new ArrayList<Integer>();
        ArrayList<Integer> numImpares = new ArrayList<Integer>();
        //Llenado del vector con números aleatorios
        for (int i = 0; i <= 19; i++) {
            vector[i] = (int)(Math.random() * 100 +1);
        }
        //llenado del arreglo de números pares y el de impares
        for (int i = 0; i <= 19; i++) {
            division = (vector[i])%2;
            if (division == 0){
                numPares.add(vector[i]);
            }else {
                numImpares.add(vector[i]);
            }
        }
        //Impresión del arreglo con números pares
        System.out.print("Números pares: ");
        int i = 0;
        while (i < numPares.size()) {
            System.out.print(numPares.get(i) + " ");
            i++;
        }
        //Impresión renglón vacío
        System.out.println("");
        //Impresión del arreglo con números impares
        System.out.print("Números impares: ");
        i = 0;
        while (i < numImpares.size()) {
            System.out.print(numImpares.get(i) + " ");
            i++;
        }
    }
}
