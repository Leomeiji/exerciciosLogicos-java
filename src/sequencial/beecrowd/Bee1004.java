package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1004 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int prod = valor1 * valor2;

        System.out.print("PROD = " + prod);

        scan.close();
    }
}
