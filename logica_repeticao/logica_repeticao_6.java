package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_6 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        int idade = 0;        
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite a " + i + "º idade: ");
            idade = leitura.nextInt();
            soma = soma + idade;
        }
        
        System.out.println("A soma das 10 idades é: " + soma);
    }
}
