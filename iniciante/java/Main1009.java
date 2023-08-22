package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1009 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
            String nome = sc.nextLine();

            double salarioFixo = sc.nextFloat();
            double totalVendaMes = sc.nextFloat();
            double salarioFinal = 0;

            if(totalVendaMes > 0){
                double comissao = totalVendaMes * 0.15;
                salarioFinal = salarioFixo + comissao;
                
            }else{
               salarioFinal = salarioFixo;
            }

            System.out.format("TOTAL = R$ %.2f%n", salarioFinal);
        
        sc.close();
    }
}
