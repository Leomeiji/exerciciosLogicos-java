package sequencial.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("AREA DO CIRCULO = %.2f\n",area);

        scan.close();
    }
}
