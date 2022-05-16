public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            String espacio = new String(new char[10-i]).replace("\0", " ");
            String asterisco = new String(new char[i]).replace("\0", "*");
            System.out.print(espacio);
            System.out.println(asterisco);
            i++;
        }
    }
}
