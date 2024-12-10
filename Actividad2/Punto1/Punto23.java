package Punto1;

import java.util.Scanner;

public class Punto23 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        // Calcular discriminante
        double discriminante = B * B - 4 * A * C;

        // Procesar segun el discriminante
        if (discriminante > 0) {
            // Dos raices distintas
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + raiz1 + " y x2 = " + raiz2);
        } else if (discriminante == 0) {
            // Una unica raiz
            double raiz1 = -B / (2 * A);
            System.out.println("La solucion es unica: x = " + raiz1);
        } else {
            // Soluciones complejas
            double realParte = -B / (2 * A);
            double imaginarioParte = Math.sqrt(-discriminante) / (2 * A);
            System.out.println("Las soluciones son complejas:");
            System.out.println("x1 = " + realParte + " + " + imaginarioParte + "i");
            System.out.println("x2 = " + realParte + " - " + imaginarioParte + "i");
        }

        scanner.close();
    }
}

