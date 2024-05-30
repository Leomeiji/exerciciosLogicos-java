package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe se o sexo e F - feminino ou M - masculino: ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("O sexo informado é feminino!");
        }
        else if (sexo.equalsIgnoreCase("m")){
            System.out.println("O sexo informado é masculino!");
        }
        else {
            System.out.println("Sexo inválido!");
        }

        scan.close();
    }
}
