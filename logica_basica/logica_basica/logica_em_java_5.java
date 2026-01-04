package logica_basica;
import java.util.Scanner;

public class logica_em_java_5 {
    
    public static void main(String[] args) {
        
        int salarioMinimo = 1500;

        int salarioUsuario;

        Scanner prosc = new Scanner(System.in);

        System.out.println("Digite seu salário atual: \n");
        salarioUsuario = prosc.nextInt();

        int quantSalarioMinimo = salarioUsuario / (salarioMinimo);

        System.out.printf("Seu salário atual equivale a: %d salário(s) mínimo(s)" , quantSalarioMinimo);

    }
}
