package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a distancia a ser percorrida: ");
        int distancia = scan.nextInt();

        if (distancia <= 200) {
            double viagensCurtas = distancia * 0.50;
            System.out.printf("O preco da passagem e: R$ %.2f\n",viagensCurtas);
        }
        else {
            double viagensLongas = distancia * 0.45;
            System.out.printf("O preco da passagem e: R$ %.2f\n",viagensLongas);

        }

        scan.close();
    }
}
