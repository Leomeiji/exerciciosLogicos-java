package sequencial.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        int temperaturaF = scan.nextInt();

        int celsius = (5 * (temperaturaF - 32) / 9);
        System.out.println("A temperatura de F para C é: " + celsius);

        scan.close();
    }
}
