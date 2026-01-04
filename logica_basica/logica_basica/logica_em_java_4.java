package logica_basica;
import java.util.Scanner;

public class logica_em_java_4 {
    
    public static void main(String[] args) {
        
        double valor1 = 50.00;
        int quant1;

        double valor2 = 100.00;
        int quant2;

        Scanner prosc = new Scanner(System.in);

        System.out.println("Digite a quantidade do item 1: \n");
        quant1 = prosc.nextInt(); 


        System.out.println("Digite a quantidade do item 2: \n");
        quant2 = prosc.nextInt();

        double IPI = 34.00;

        double total = (valor1 * quant1) + (valor2 * quant2) * (IPI/(100 + 1));

        System.out.println(total);

        //(valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
    }
}
