import java.util.Scanner;

public class Trapecio {
    float baseMenor = 0;
    float baseMayor = 0;
    float altura = 0;
    float area;
    Scanner input = new Scanner(System.in);

    public Trapecio(){
        System.out.println("Área del trapecio");
        System.out.print("Base menor: ");
        this.baseMenor = input.nextFloat();
        System.out.print("Base mayor: ");
        this.baseMayor = input.nextFloat();
        System.out.print("Altura: ");
        this.altura = input.nextFloat();
    }
    public void area(){
        this.area = ((this.baseMenor + this.baseMayor) * this.altura) / 2;
        System.out.print("Área del trapecio: " + this.area + " unidades cuadradas\n");
    }
}
