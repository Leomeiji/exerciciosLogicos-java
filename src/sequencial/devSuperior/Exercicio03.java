package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        String primeiroNome = scan.nextLine();
        System.out.print("Idade: ");
        double primeiraIdade = scan.nextDouble();
        System.out.println("Dados da segunda pessoa: ");
        scan.nextLine();
        System.out.print("Nome: ");
        String segundoNome = scan.nextLine();
        System.out.print("Idade: ");
        double segundaIdade = scan.nextDouble();

        double media = (primeiraIdade + segundaIdade) / 2.0;
        System.out.printf("A idade média de %s e %s é de %.1f anos",primeiroNome, segundoNome, media);


        scan.close();

    }
}
