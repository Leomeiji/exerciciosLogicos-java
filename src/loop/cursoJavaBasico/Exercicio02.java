package loop.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean informacaoValida = false;
        String nomeUsuario;
        String senha;

        do {
            System.out.println("Informe o nome do usuario : ");
            nomeUsuario = scan.next();

            System.out.println("Informe a senha: ");
            senha = scan.next();

            if (nomeUsuario.equalsIgnoreCase(senha)) {
                System.out.println("Senha igual a usuário, digite novamente");
            }
            else {
                informacaoValida = true;
                System.out.println("Senha e usuários válidos");
            }
        } while (!informacaoValida);

        scan.close();
    }
}
