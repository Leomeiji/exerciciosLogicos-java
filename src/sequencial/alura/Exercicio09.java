package sequencial.alura;

public class Exercicio09 {

    public static void main(String[] args) {

        double precoOriginal = 200.00;
        double percentualDesconto = 10.0;
        double total = precoOriginal - (precoOriginal * percentualDesconto / 100);
        System.out.printf("Valor Final = %.2f\n", total);
    }
}
