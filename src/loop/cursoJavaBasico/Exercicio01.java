package loop.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {

            System.out.println("Informe uma nota: ");

            int nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("nota válida!");
            }
            else {
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida);


        scan.close();

    }
}
