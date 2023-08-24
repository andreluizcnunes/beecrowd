package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            double raio = sc.nextDouble();
            double resultado = (4.0 / 3) * 3.14159 * (raio * raio * raio);

            System.out.format("VOLUME = %.3f%n", resultado);

        sc.close();
    }
}
