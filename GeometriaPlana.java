import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GeometriaPlana {
    private GeometriaPlana() {}

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double calcularAreaCircunferencia(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}