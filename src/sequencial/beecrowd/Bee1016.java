package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1016 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int distancia = numero * 2;
        System.out.println(distancia + " minutos");

        scan.close();
    }
}
