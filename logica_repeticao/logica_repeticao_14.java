package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_14 {
    
    public static void main(String[] args) {
    
        int soma = 0;
        int num = 0;
        int quantNumRange0a100 = 0;
        int quantNumRange101a200 = 0;
        int quantNumRange200 = 0;
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++){
            System.out.print("Digite o " + i + "º número: ");
            num = leitura.nextInt();
            soma = soma + num;
            
            if(num >= 0 && num <= 100){
                quantNumRange0a100 ++;    
            }
            else if (num >= 101 && num <= 200){
                quantNumRange101a200 ++;
            }else{
                quantNumRange200 ++;
            }
        
    }
    System.out.println("A quantidade de numeros entre 0 e 100 são " + quantNumRange0a100);

    System.out.println("A quantidade de numeros entre 101 e 200 são " + quantNumRange101a200);

    System.out.println("A quantidade de numeros maiores que 200 são " + quantNumRange200);
        
    }
}
