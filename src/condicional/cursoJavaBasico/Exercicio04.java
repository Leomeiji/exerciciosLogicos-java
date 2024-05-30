package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe uma letra para verificação: ");
        String letra = scan.next();

        if(letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        }
        else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("vogal");
                    break;
                default:
                    System.out.println("consoante");
                    break;

            }
        }
        

        scan.close();
    }
}
