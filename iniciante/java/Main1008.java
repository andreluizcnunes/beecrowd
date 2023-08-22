package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1008 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);

            int codFuncionario = sc.nextInt();
            int horasTrabalhadas = sc.nextInt();
            double valorHora = sc.nextDouble();

            double salario = horasTrabalhadas * valorHora;

            System.out.println("NUMBER = " + codFuncionario);
            System.out.format("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
