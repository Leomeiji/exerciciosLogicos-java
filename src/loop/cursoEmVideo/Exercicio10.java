package loop.cursoEmVideo;

public class Exercicio10 {

    public static void main(String[] args) {

        int numero = 500;
        int soma = 0;

        while (numero >= 0)  {
            soma = soma + numero;
            numero = numero - 50;
            System.out.println(soma);
        }
        System.out.println("A soma da sequencia é: " + soma);
    }
}
