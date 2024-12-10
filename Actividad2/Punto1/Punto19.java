package Punto1;
import java.util.Scanner;

public class Punto19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del triangulo equilatero: ");
        double lado = scanner.nextDouble();

        double perimetro = 3 * lado;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (lado * altura) / 2;

        System.out.printf("Perimetro: %.2f\n", perimetro);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Area: %.2f\n", area);

        scanner.close();
    }
}

