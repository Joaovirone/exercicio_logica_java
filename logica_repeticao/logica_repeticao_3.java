package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_3 {
    
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: \n");
        nome = leitura.nextLine();


        int quantNome;
        for(quantNome = 0; quantNome<10; quantNome ++){
        System.out.print("\n" + nome);
        }
    }
}
