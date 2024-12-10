package Punto1;
import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el primer numero (N1): ");
        int N1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero (N2): ");
        int N2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero (N3): ");
        int N3 = scanner.nextInt();

        // Determinar el mayor de los tres numeros
        int mayor;
        if (N1 > N2 && N1 > N3) {
            mayor = N1;
        } else if (N2 > N3) {
            mayor = N2;
        } else {
            mayor = N3;
        }

        // Mostrar el resultado
        System.out.printf("EL VALOR MAYOR ENTRE %d, %d Y %d ES: %d\n", N1, N2, N3, mayor);

        scanner.close();
    }
}

