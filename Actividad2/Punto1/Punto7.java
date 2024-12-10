package Punto1;
import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        // Comparacion y salida
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }

        scanner.close();
    }
}