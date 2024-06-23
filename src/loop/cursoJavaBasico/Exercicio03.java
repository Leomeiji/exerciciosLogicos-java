package loop.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean nomeValidado = false;
        boolean idadeValida = false;
        boolean salarioValidado = false;
        boolean sexoValidado = false;
        boolean estadoCivilValidado = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        char resposta;

        do {
            do {
                System.out.print("Entre com o nome: ");
                nome = scan.next();

                if (nome.length() < 3){
                    System.out.println("Valor de caracteres errado. Tente novamente!");
                }
                else {
                    nomeValidado = true;
                    System.out.println("Valor de caracteres validados.");
                }

            } while (!nomeValidado);

            do {
                System.out.print("Entre com a idade: ");
                idade = scan.nextInt();

                if (idade > 150) {
                    System.out.println("Idade inválida. Tente novamente!");
                }
                else {
                    idadeValida = true;
                    System.out.println("Idade válida!");
                }

            } while(!idadeValida);

            do {
                System.out.print("Entre com o salario: ");
                salario = scan.nextDouble();

                if (salario < 0) {
                    System.out.println("Salário inválido. Tente novamente!");
                }
                else {
                    salarioValidado= true;
                    System.out.println("Salário válido!");
                }
            } while(!salarioValidado);

            do {
                System.out.print("Entre com o sexo: ");
                sexo = scan.next();

                if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
                    sexoValidado = true;
                    System.out.println("Sexo válido!");
                }
                else {
                    System.out.println("Sexo inválido. Tente novamente!");
                }

            } while(!sexoValidado);

            do {
                System.out.print("Entre com o estado civil: ");
                estadoCivil = scan.next();

                if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                    estadoCivilValidado = true;
                    System.out.println("E.C válido!");
                }
                else {
                    System.out.println("Sexo inválido ");
                }

            } while(!estadoCivilValidado);

            System.out.print("Todas as etapas foram validadas s/n: ");
            resposta = scan.next().charAt(0);

        } while(resposta != 's');
    }
}
