import java.util.Scanner;

public class Rectangulo {
    float base = 0;
    float altura = 0;
    float area;
    Scanner input = new Scanner(System.in);

    public Rectangulo(){
        System.out.println("Área del rectángulo");
        System.out.print("Base: ");
        this.base = input.nextFloat();
        System.out.print("Altura: ");
        this.altura = input.nextFloat();
    }
    public void area(){
        this.area = this.base * this.altura;
        System.out.print("Área del rectángulo: " + this.area + " unidades cuadradas\n");
    }
}
