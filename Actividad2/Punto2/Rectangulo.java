package Punto2;

public class Rectangulo {
    int base;
    int altura;

    // Constructor para inicializar la base y la altura del rectangulo
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo para calcular el area del rectangulo
    double calcularArea() {
        return base * altura; // Area = base * altura
    }

    // Metodo para calcular el perimetro del rectangulo
    double calcularPerimetro() {
        return (2 * base) + (2 * altura); // Perimetro = 2 * base + 2 * altura
    }
}

