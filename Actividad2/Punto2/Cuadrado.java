package Punto2;

public class Cuadrado {
    int lado;

    // Constructor para inicializar el lado del cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Metodo para calcular el area del cuadrado
    double calcularArea() {
        return lado * lado; // Area = lado * lado
    }

    // Metodo para calcular el perimetro del cuadrado
    double calcularPerimetro() {
        return 4 * lado; // Perimetro = 4 * lado
    }
}

