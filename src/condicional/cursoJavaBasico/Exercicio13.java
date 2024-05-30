package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        int diaDaSemana = scan.nextInt();
        String hoje;

        switch (diaDaSemana) {
            case 1:
                hoje = "Domingo";
                break;
            case 2:
                hoje = "Segunda-Feira";
                break;
            case 3:
                hoje = "Terça-Feira";
                break;
            case 4:
                hoje = "Quarta-Feira";
                break;
            case 5:
                hoje = "Quinta-feira";
                break;
            case 6:
                hoje = "Sexta-feira";
                break;
            case 7:
                hoje = "Sábado";
                break;
            default:
                hoje = "Valor inválido";
                System.out.println(hoje);
                break;
        }

        System.out.println("Hoje é " + hoje);

        scan.close();
    }
}
