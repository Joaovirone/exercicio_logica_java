package logica_basica;

import java.util.*;


public class logica_em_java_1 {
    public static void main(String[] args){
    int idadeAno, idadeMes, idadeDia;
    Scanner leitura = new Scanner(System.in);

    System.out.println("Irei mostrar sua idade em em dias, preciso apenas que me falei a idade em anos, meses e dias e irei converter para dias\n");
    
    System.out.println("Digite sua idade em anos: \n");
    idadeAno = leitura.nextInt();

    System.out.println("Digite sua idade em meses: \n");
    idadeMes = leitura.nextInt();

    System.out.println("Digite sua idade em dias: \n");
    idadeDia = leitura.nextInt();

    int opAno = (idadeAno*365);
    int opMes = (idadeMes*30);

    int totalDias = opAno + opMes + idadeDia;
    
    System.out.printf("Anos em dia: %d | Meses em dia : %d | Dias: %d | Total de dias: %d", opAno,opMes,idadeDia, totalDias);

    



    }
}
