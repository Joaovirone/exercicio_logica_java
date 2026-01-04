package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_10 {
    
    public static void main(String[] args) {
        
        
        int num = 0;
        int menorIdade = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número que irei mostrar a tabuada dele: ");
        num = leitura.nextInt();
        
        for(int i = 1; i <= 10; i++){
            
            int produto = i * num;

            System.out.println(produto);
          
        
    }
    
}
}
