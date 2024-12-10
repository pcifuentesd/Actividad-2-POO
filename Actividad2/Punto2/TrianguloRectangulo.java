package Punto2;

public class TrianguloRectangulo {
    int base;
    int altura;

    // Constructor para inicializar la base y la altura del triangulo rectangulo
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo para calcular el area del triangulo rectangulo
    double calcularArea() {
        return (base * altura) / 2.0; // Area = (base * altura) / 2
    }

    // Metodo para calcular el perimetro del triangulo rectangulo
    double calcularPerimetro() {
        return base + altura + calcularHipotenusa(); // Perimetro = base + altura + hipotenusa
    }

    // Metodo para calcular la hipotenusa del triangulo rectangulo
    double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura); // Hipotenusa = raiz cuadrada(base^2 + altura^2)
    }

    // Metodo para determinar el tipo de triangulo
    void determinarTipoTriangulo() {
        if (base == altura && base == calcularHipotenusa() && altura == calcularHipotenusa()) {
            System.out.println("Es un triangulo equilatero");
        } else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
    }
}

