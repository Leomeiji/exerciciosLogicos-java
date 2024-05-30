package sequencial.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo: ");
        int mb = scan.nextInt();

        System.out.println("Digite a velocidade: ");
        int mbps = scan.nextInt();

        double tempo = mb / mbps;

        System.out.println("Tempo de dowload: " + tempo);


        scan.close();
    }
}
