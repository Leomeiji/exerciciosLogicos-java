package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();

        System.out.print("Digite o seu sexo M ou F: ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("m")) {
            double pesoIdealHomem = (72.7 * altura - 58);
            System.out.printf("Peso ideal: %.2f\n",pesoIdealHomem) ;
        } else if (sexo.equalsIgnoreCase("f")) {
            double pesoIdealMulher = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f\n",pesoIdealMulher);
        } else {
            System.out.println("Sexo inválido!");
        }

        System.out.println("Você está abaixo ou acima do peso: ");
        String information = scan.next();
        System.out.println(information);

        scan.close();
    }
}
