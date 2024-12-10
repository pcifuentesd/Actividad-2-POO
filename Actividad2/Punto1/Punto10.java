package Punto1;
import java.util.Scanner;

public class Punto10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el numero de inscripcion: ");
        int numeroInscripcion = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva linea

        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = scanner.nextInt();

        // Calculo del valor de la matricula
        double pagoMatricula = 50000;
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }

        // Mostrar resultado
        System.out.printf("\nEL ESTUDIANTE CON NUMERO DE INSCRIPCION %d Y NOMBRE %s DEBE PAGAR: $%.2f\n",
                          numeroInscripcion, nombres, pagoMatricula);

        scanner.close();
    }
}

