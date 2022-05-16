public class Ejercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            String asterisco = new String(new char[i]).replace("\0", "*");
            System.out.println(asterisco);
        }
    }
}
