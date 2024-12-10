package Punto1;
import java.util.Scanner;

public class Punto15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera D: ");
        double pesoD = scanner.nextDouble();

        // Identificar cual esfera es diferente y su peso relativo
        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (pesoC > pesoA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (pesoB > pesoD) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (pesoA > pesoB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }

        scanner.close();
    }
}

