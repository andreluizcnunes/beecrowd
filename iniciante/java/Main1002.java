package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1002 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // forumula area = π . raio2
        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n * (raio * raio);
        System.out.format("A=%.4f%n", area);

        sc.close();
    }

}
