package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            if((A >= 0 && A <= 10) && (B >= 0 && B <= 10) && (C >= 0 && C <= 10)){
                
                double media = (A * 2.0 + B * 3.0 + C * 5.0) / 10 ;
    
                System.out.format("MEDIA = %.1f%n", media);
            }

        sc.close();
    }
}
