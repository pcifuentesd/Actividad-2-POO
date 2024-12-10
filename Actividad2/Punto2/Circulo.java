package Punto2;

public class Circulo {
    int radio;

    // Constructor para inicializar el radio del circulo
    Circulo(int radio) {
        this.radio = radio;
    }

    // Metodo para calcular el area del circulo
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Area = \pi * radio^2
    }

    // Metodo para calcular el perimetro del circulo
    double calcularPerimetro() {
        return 2 * Math.PI * radio; // Perimetro = 2 * \pi * radio
    }
}

