package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double precoDoProduto = scan.nextDouble();

        double promocao = precoDoProduto * 5 / 100;
        double precoFinal = precoDoProduto - promocao;

        System.out.printf("O preço promocional é %.2f\n",precoFinal);

        scan.close();
    }
}
