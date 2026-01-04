package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_15 {
    
    public static void main(String[] args) {
        
        
       
        Scanner leitura = new Scanner(System.in);
        int num;
        System.out.print("Digite um número positivo para o código continuar e para parar digite número negativo ");
        num = leitura.nextInt();

        
        while (num >= 0) {
            System.out.printf("o numéro digitado foi |%d| \n", num);
            
            System.out.print("Digite outro número: \n");
            num = leitura.nextInt();

        }
        

}   
}
