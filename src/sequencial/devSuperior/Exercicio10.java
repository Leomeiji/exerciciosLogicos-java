package sequencial.devSuperior;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int duracao = scan.nextInt();

        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        scan.close();
    }
}
