package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double resultX = (x2-x1)*(x2-x1);
            double resultY = (y2 - y1)*(y2 - y1);

            double resultado = Math.sqrt(resultX + resultY);

            System.out.format("%.4f%n", resultado);

        sc.close();
    }
}
