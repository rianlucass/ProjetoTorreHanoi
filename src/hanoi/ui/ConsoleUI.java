package hanoi.ui;

import hanoi.service.GameManager;
import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        GameManager game = new GameManager();
        game.inicializarDiscos();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            game.exibirPilhass();
            System.out.println("Limite de movimentos: 7");
            System.out.println("Total de movimentos: " + game.getMovimentosAtuais());
            System.out.println("\nDigite em maiusculo o movimento (ex: A B para mover de A para B): ");
            char de = scanner.next().charAt(0);
            char para = scanner.next().charAt(0);
            game.moverDisco(de, para);
        }
    }
}
