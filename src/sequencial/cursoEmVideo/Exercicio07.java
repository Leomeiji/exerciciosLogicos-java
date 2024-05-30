package sequencial.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numeroDigitado = scan.nextDouble();

        double dobro = numeroDigitado * 2;
        double tercaParte = numeroDigitado / 3;

        System.out.printf("O dobro de %.1f é %.1f\n",numeroDigitado,dobro);
        System.out.printf("A terça parte de %.1f é %.4f\n",numeroDigitado,tercaParte);

        scan.close();
    }
}
