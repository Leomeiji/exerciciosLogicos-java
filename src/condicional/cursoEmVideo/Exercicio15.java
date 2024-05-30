package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        int peso = scan.nextInt();

        System.out.print("Informe a altura: ");
        double altura = scan.nextDouble();

        double calculoIMC = peso / (Math.pow(altura ,2));

        System.out.printf("O Índíce de massa corporea: %.2f\n",calculoIMC);

        if (calculoIMC < 18.5) {
            System.out.println("ABAIXO DO PESO!");
        }
        else if (calculoIMC < 25) {
            System.out.println("PESO IDEAL!");
        }
        else if (calculoIMC < 30) {
            System.out.println("SOBREPESO!");
        }
        else if (calculoIMC < 40) {
            System.out.println("OBESIDADE!");
        }
        else {
            System.out.println("OBESIDADE MORBIDA!");
        }

        scan.close();
    }
}
