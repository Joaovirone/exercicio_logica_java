package logica_basica;
import java.util.Scanner;

public class logica_em_java_6 {
    
    public static void main(String[] args) {
        
        int num;

        Scanner prosc = new Scanner(System.in);

        System.out.print("Digite algum número inteiro que irei mostrar seu sucessor e antecessor: \n");
        num = prosc.nextInt();

        int numSucessor = num + 1;
        int numAntecessor = num -1;

        System.out.printf("NÚMERO |%d| - SUCESSOR |%d| - ANTECESSOR |%d|",num, numSucessor, numAntecessor);

    }
}
