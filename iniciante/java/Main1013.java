package iniciante.java;

import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) {
        // declarando variavel para entrada de dados SC
        Scanner sc = new Scanner(System.in);

            // declarando variaveis inteiras
            int valorA = sc.nextInt();
            int valorB = sc.nextInt();
            int valorC = sc.nextInt();

            // calculo para saber o valor maior entre valorA e valorB
            int maiorAB = (valorA + valorB + (Math.abs(valorA-valorB))) / 2;

            // calculo para saber o valor maior entre maiorAB e C
            int maior = (maiorAB + valorC + Math.abs(maiorAB - valorC)) / 2;

            System.out.println(maior + " eh o maior");

        sc.close();
    }
}
