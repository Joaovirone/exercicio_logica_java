package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_7 {
    public static void main(String[] args) {
        
    
        int soma = 0;
        int idade = 0;
        int media = 0;      
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite a " + i + "º idade: ");
            idade = leitura.nextInt();
            soma = soma + idade;
            media = soma / i;
             
        }
        
        System.out.println("A media das 20 idades é: " + media);
}}
