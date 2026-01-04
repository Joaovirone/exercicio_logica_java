package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_9 {

     public static void main(String[] args) {
        
        int soma = 0;
        int idade = 0;
        int menorIdade = 0;
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Digite a " + i + "º idade: ");
            idade = leitura.nextInt();
            soma = soma + idade;
            
            if(idade < 18){
                menorIdade++;    
            }    
        
    }
    System.out.println("A quantidade de pessoas menores de idade são " + menorIdade);
}
    
}
