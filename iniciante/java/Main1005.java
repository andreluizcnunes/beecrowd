package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1005 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        

            double A = sc.nextDouble();
            double B = sc.nextDouble();

            if((A >=0 && B <= 10) && (B >= 0 && B <= 10)){

                double media = (A * 3.5 + B * 7.5) / 11 ;
    
                System.out.format("MEDIA = %.5f%n", media);
            }



        sc.close();
    }
}
