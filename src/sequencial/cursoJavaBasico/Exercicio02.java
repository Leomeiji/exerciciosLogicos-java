package sequencial.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroInformado = scan.nextInt();

        System.out.println("O número informado foi: " + numeroInformado);

        scan.close();
    }
}
