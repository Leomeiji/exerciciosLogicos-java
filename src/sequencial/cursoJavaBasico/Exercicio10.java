package sequencial.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        int temperaturaC = scan.nextInt();

        double f = temperaturaC * 1.8 + 32;
        System.out.println("A temperatura de C para F é: " + f);

        scan.close();
    }
}

