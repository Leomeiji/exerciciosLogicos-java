package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a velocidade do carro: ");
        int velocidade = scan.nextInt();

        if (velocidade > 80) {
            System.out.println("Você foi multado!");

            double excesso = velocidade - 80;
            double multa = excesso * 5.00;
            System.out.printf("Você pagará: R$%.2f\n",multa);
        }
        else {
            System.out.println("Você está dentro da velocidade!!");
        }

        scan.close();
    }
}
