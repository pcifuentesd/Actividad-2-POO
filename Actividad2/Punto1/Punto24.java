package Punto1;

import java.util.Scanner;

public class Punto24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        // Determinar cual esfera tiene mayor peso
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else {
            System.out.println("La esfera C es la de mayor peso.");
        }

        scanner.close();
    }
}

