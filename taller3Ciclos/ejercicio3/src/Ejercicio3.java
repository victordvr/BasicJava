public class Ejercicio3 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i <= 11){
                String espacio = new String(new char[11-i]).replace("\0", " ");
                String asterisco = new String(new char[i]).replace("\0", "*");
                String asteriscoMenosUno = new String(new char[i-1]).replace("\0", "*");
                System.out.print(espacio);
                System.out.print(asterisco);
                System.out.println(asteriscoMenosUno);
            }else if (i == 12 || i == 13){
                String espacioAd = new String(new char[9]).replace("\0", " ");
                String asteriscoAd = new String(new char[3]).replace("\0", "*");
                System.out.print(espacioAd);
                System.out.println(asteriscoAd);
            }else if (i == 14){
                String espacios8 = new String(new char[8]).replace("\0", " ");
                String asteriscos5 = new String(new char[5]).replace("\0", "*");
                System.out.print(espacios8);
                System.out.println(asteriscos5);
            }else {
                String espacios7 = new String(new char[7]).replace("\0", " ");
                String asteriscos7 = new String(new char[7]).replace("\0", "*");
                System.out.print(espacios7);
                System.out.println(asteriscos7);
            }

            i++;
        }while (i <= 15);
    }
}
