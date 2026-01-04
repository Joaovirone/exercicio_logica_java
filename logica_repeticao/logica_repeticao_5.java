package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_5 {

    public static void main(String[] args) {
        
        int soma = 0;
        int num = 0;        
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Digite o " + i + "º número: ");
            num = leitura.nextInt();
            soma = soma + num;
        }
        
        System.out.println("A soma dos 10 números é: " + soma);
    }
}

