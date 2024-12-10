package Punto1;
import java.util.Scanner;

public class Punto21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el lado a del triangulo: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado b del triangulo: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado c del triangulo: ");
        double c = scanner.nextDouble();

        // Calculos
        double perimetro = a + b + c;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

        // Resultados
        System.out.printf("Perimetro: %.2f\n", perimetro);
        System.out.printf("Semiperimetro: %.2f\n", semiperimetro);
        System.out.printf("Area: %.2f\n", area);

        scanner.close();
    }
}

