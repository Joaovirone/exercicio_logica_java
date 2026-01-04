package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_13 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        int num = 0;
        int quantNum = 0;
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++){
            System.out.print("Digite o " + i + "º número: ");
            num = leitura.nextInt();
            soma = soma + num;
            
            if(num >= 0 && num <= 100){
                quantNum++;    
            }    
        
    }
    System.out.println("A quantidade de numeros entre 0 e 100 são " + quantNum);
    }
}
