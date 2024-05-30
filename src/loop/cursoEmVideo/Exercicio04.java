package loop.cursoEmVideo;

public class Exercicio04 {

    public static void main(String[] args) {

        int contagem = 100;

        while(contagem >= 0) {
            System.out.print(contagem + " ");
            contagem -= 5;
        }
        System.out.print("Acabou!");
    }
}
