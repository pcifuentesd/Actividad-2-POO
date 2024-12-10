package Punto1;

import java.util.Scanner;

public class Punto22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Ingrese el salario basico por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Ingrese el numero de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        // Calcular el salario mensual
        double salarioMensual = salarioPorHora * horasTrabajadas;

        // Mostrar informacion segun el salario mensual
        System.out.println("Empleado: " + nombreEmpleado);
        if (salarioMensual > 450000) {
            System.out.printf("Salario mensual: $%.2f\n", salarioMensual);
        }

        scanner.close();
    }
}

