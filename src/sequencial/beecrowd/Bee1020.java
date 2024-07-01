package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1020 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dias = scan.nextInt();
        int ano = dias / 365;
        dias = dias % 365;
        int mes = dias / 30;
        dias = dias % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");

        scan.close();
    }
}
