package Punto1;
import java.util.Scanner;

public class Punto12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas en la semana (NHT): ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo (VHN): ");
        double valorHora = scanner.nextDouble();

        // Variables para calculo
        int horasExtras = 0, horasExtrasDobles = 0;
        double salario = 0;

        // Calculo del salario
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;

            if (horasExtras > 8) {
                horasExtrasDobles = horasExtras - 8;
                salario = (40 * valorHora) + (8 * 2 * valorHora) + (horasExtrasDobles * 3 * valorHora);
            } else {
                salario = (40 * valorHora) + (horasExtras * 2 * valorHora);
            }
        } else {
            salario = horasTrabajadas * valorHora;
        }

        // Mostrar el resultado
        System.out.printf("EL TRABAJADOR %s DEVENGO: $%.2f\n", nombre, salario);

        scanner.close();
    }
} 

