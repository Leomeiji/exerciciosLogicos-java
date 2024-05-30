package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int pontuacao = 0;

        System.out.print("Informe o numero de horas de atividades do mês: ");
        int horasDeAtividades = scan.nextInt();

        if (horasDeAtividades < 10) {
            pontuacao = horasDeAtividades * 2;

            System.out.println("HORAS DE ATIVIDADES DO MES = " + horasDeAtividades);
            System.out.println("PONTUACAO DO MES = " + pontuacao);
        }
        else if (horasDeAtividades < 20) {
            pontuacao = horasDeAtividades * 5;

            System.out.println("HORAS DE ATIVIDADES DO MES = " + horasDeAtividades);
            System.out.println("PONTUACAO DO MES = " + pontuacao);
        }
        else {
            pontuacao = horasDeAtividades * 10;

            System.out.println("HORAS DE ATIVIDADES DO MES = " + horasDeAtividades);
            System.out.println("PONTUACAO DO MES = " + pontuacao);
        }

        double faturamento = pontuacao * 0.05;
        System.out.printf("VOCÊ GANHOU = %.2f\n", faturamento);

        scan.close();
    }
}
