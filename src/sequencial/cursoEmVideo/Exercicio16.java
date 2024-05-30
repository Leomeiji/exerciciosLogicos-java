package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de cigarros fumados por dia: ");
        int qtdCigarros = scan.nextInt();

        System.out.print("Quantos anos você já fumou: ");
        int anosFumados = scan.nextInt();

        int totalCigarros = qtdCigarros * 365 * anosFumados;
        int tempoPerdidoMinutos = totalCigarros * 10;
        int tempoPerdidoDias = tempoPerdidoMinutos / 1440;
        int tempoPerdidoEmAnos = tempoPerdidoDias / 365;

        System.out.println("Você perdeu aproximadamente " + tempoPerdidoDias + " dias de vida.");
        System.out.println("Você perdeu aproximadamente " + tempoPerdidoEmAnos + " anos de vida.");

        scan.close();

    }
}
