package logica_repeticao;

import java.util.Scanner;

public class logica_repeticao_4 {
    
    public static void main(String[] args) {

        int N;
        String nome;        
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = leitura.nextLine();

        System.out.print("Digite a quantidade para seu nome aparecer: ");
        N = leitura.nextInt();

        for(int i = 0; i < N; i++){
            System.out.println(nome);
        }
    }
}
