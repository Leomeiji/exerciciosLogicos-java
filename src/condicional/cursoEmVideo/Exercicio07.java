package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Informe o seu sexo: ");
        String sexo = scan.next();

        System.out.print("Informe o valor total das compras: ");
        double totalDasCompras = scan.nextDouble();

        double desconto5 = (totalDasCompras / 100) * 5;
        double desconto13 = (totalDasCompras / 100) * 13;

        if(sexo.equalsIgnoreCase("m")){
            double contaFinal = totalDasCompras - desconto5;
            System.out.printf("Total das suas compras: R$%.2f\n", totalDasCompras);
            System.out.printf("Desconto de 5%% nas compras: R$%.2f\n", desconto5);
            System.out.printf("TOTAL = R$%.2f\n",contaFinal);
        }
        else {
            double contaFinal = totalDasCompras - desconto13;
            System.out.printf("Total das suas compras: R$%.2f\n", totalDasCompras);
            System.out.printf("Desconto de 13%% nas compras: R$%.2f\n", desconto13);
            System.out.printf("TOTAL = R$%.2f\n",contaFinal);

        }

        scan.close();
    }
}
