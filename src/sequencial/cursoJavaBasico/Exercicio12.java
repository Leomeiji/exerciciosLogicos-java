package sequencial.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("O peso ideal é: %.2f\n",pesoIdeal);

        scan.close();
    }
}
