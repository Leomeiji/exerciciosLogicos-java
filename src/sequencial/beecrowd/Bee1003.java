package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1003 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int soma = a + b;

        System.out.print("SOMA = " + soma);

        scan.close();
    }
}
