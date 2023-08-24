package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        // a) a área do triângulo retângulo que tem A por base e C por altura.
        double areaTriangulo = A * C / 2;

        // b) a área do círculo de raio C. (pi = 3.14159)
        double areaCirculo = pi * (C * C);

        // c) a área do trapézio que tem A e B por bases e C por altura.
        // A=(a+b)h/2
        double areaTrapezio = (A + B) * C / 2;

        // d) a área do quadrado que tem lado B.
        double areaQuadrado = B * B;

        // e) a área do retângulo que tem lados A e B.
        double areaRetangulo = A * B;


        // TRIANGULO:
        System.out.format("TRIANGULO: %.3f%n", areaTriangulo);
        // CIRCULO:
        System.out.format("CIRCULO: %.3f%n", areaCirculo);
        // TRAPEZIO:
        System.out.format("TRAPEZIO: %.3f%n", areaTrapezio);
        // QUADRADO: 
        System.out.format("QUADRADO: %.3f%n", areaQuadrado);
        // RETANGULO:
        System.out.format("RETANGULO: %.3f%n", areaRetangulo);
        
        sc.close();
    }
}
