package Punto1;
import java.util.Scanner;

public class Punto13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva linea

        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL, ROJO): ");
        String color = scanner.nextLine().toUpperCase();

        // Variables para calculo
        double porcentajeDescuento;
        double valorPagar;

        // Determinar el porcentaje de descuento segun el color
        switch (color) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            case "ROJO":
                porcentajeDescuento = 100;
                break;
            default:
                System.out.println("Color invalido. Por favor, introduzca un color valido.");
                scanner.close();
                return;
        }

        // Calcular el valor a pagar
        valorPagar = valorCompra - (porcentajeDescuento * valorCompra / 100);

        // Mostrar el resultado
        System.out.printf("EL CLIENTE DEBE PAGAR: $%.2f\n", valorPagar);

        scanner.close();
    }
}

