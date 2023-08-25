package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int distancia = sc.nextInt();
            double totalConsumo = sc.nextDouble();

            double media = distancia / totalConsumo;

            System.out.format("%.3f km/l%n", media);

        sc.close();
    }
}
