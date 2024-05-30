package sequencial.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a base do quadrado: ");
        int base = scan.nextInt();

        System.out.print("Informe a altura do quadrado: ");
        int altura = scan.nextInt();

        int area = base * altura;
        System.out.println("AREA DO QUADRADO = " + area);

        int dobroArea = area * 2;
        System.out.println("DOBRO DA AREA DO QUADRADO = " + dobroArea);

        scan.close();
    }
}
