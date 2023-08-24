package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1010{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int codigoProdutoUm = sc.nextInt();
            int quantidadeUm = sc.nextInt();
            double valorUnitarioUm = sc.nextDouble();

            int codigoProdutoDois = sc.nextInt();
            int quantidadeDois = sc.nextInt();
            double valorUnitarioDois = sc.nextDouble();


            double valorTotalCompra = quantidadeUm * valorUnitarioUm + quantidadeDois * valorUnitarioDois;

            // VALOR A PAGAR: R$

            System.out.format("VALOR A PAGAR: R$ %.2f%n", valorTotalCompra);

        sc.close();
    }
}