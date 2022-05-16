public class NumerosPrimos {
    public static void main(String[] args) {
        //declaración de variables
        int number, divisor, contador;
        //Un número primo solo tiene 2 divisiones enteras o exactas
        for (number = 1; number <= 1000; number++) {
            contador = 0;
            divisor = 1;
            while (divisor <= number){
                if (number % divisor == 0){
                    contador = contador + 1;
                }
                divisor = divisor + 1;
            }
            if (contador == 2){
                System.out.println(number);
            }
        }
    }
}
