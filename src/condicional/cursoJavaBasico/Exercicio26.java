package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o peso de peixes: ");
        double peso = scan.nextDouble();

        if (peso > 50) {
            double excesso = peso - 50;
            double multa = excesso * 4.00;
            System.out.printf("João pagará o valor de R$ %.2f reais por exceder o peso de peixes!",multa);
        } else{
            System.out.println("João não precisará pagar multa.");
        }

        scan.close();
    }
}
