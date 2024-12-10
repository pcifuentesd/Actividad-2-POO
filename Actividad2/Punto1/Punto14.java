package Punto1;
import java.util.Scanner;

public class Punto14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese las ventas del departamento 1: ");
        double ventasD1 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del departamento 2: ");
        double ventasD2 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del departamento 3: ");
        double ventasD3 = scanner.nextDouble();

        System.out.print("Ingrese el salario base de los vendedores: ");
        double salarioBase = scanner.nextDouble();

        // Calculo de las ventas totales y porcentaje
        double totalVentas = ventasD1 + ventasD2 + ventasD3;
        double porcentajeVentas = 0.33 * totalVentas;

        // Calculo de los salarios por departamento
        double salarioD1 = ventasD1 > porcentajeVentas ? salarioBase * 1.2 : salarioBase;
        double salarioD2 = ventasD2 > porcentajeVentas ? salarioBase * 1.2 : salarioBase;
        double salarioD3 = ventasD3 > porcentajeVentas ? salarioBase * 1.2 : salarioBase;

        // Mostrar resultados
        System.out.printf("SALARIO VENDEDORES DEPTO. 1: $%.2f\n", salarioD1);
        System.out.printf("SALARIO VENDEDORES DEPTO. 2: $%.2f\n", salarioD2);
        System.out.printf("SALARIO VENDEDORES DEPTO. 3: $%.2f\n", salarioD3);

        scanner.close();
    }
}

