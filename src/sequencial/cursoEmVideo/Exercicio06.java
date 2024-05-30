package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = scan.nextInt();

        int antecessor = numeroDigitado - 1;
        int sucessor = numeroDigitado + 1;

        System.out.printf("O antecessor de %d é %d\n",numeroDigitado,antecessor);
        System.out.printf("O sucessor de %d é %d\n",numeroDigitado,sucessor);

        scan.close();
    }
}
