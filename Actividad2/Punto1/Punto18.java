package Punto1;
import java.util.Scanner;

public class Punto18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el codigo del empleado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion: ");
        double retencion = scanner.nextDouble();

        double salarioBruto = horas * valorHora;
        double salarioNeto = salarioBruto * (1 - retencion / 100);

        System.out.println("\nCodigo: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.printf("Salario Bruto: $%.2f\n", salarioBruto);
        System.out.printf("Salario Neto: $%.2f\n", salarioNeto);

        scanner.close();
    }
}