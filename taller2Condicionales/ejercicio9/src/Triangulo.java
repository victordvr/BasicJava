import java.util.Scanner;

public class Triangulo {
    float base = 0;
    float altura = 0;
    float area;
    Scanner input = new Scanner(System.in);

    public Triangulo(){
        System.out.println("Área del triángulo");
        System.out.print("Base: ");
        this.base = input.nextFloat();
        System.out.print("Altura: ");
        this.altura = input.nextFloat();
    }
    public void area(){
        this.area = (this.base * this.altura) / 2;
        System.out.print("Área del triángulo: " + this.area + " unidades cuadradas\n");
    }
}
