package java.hanoi.service;

import java.hanoi.model.Stack;
import java.hanoi.ui.ConsoleUI;

public class GameManager {
    private Stack torreA;
    private Stack torreB;
    private Stack torreC;
    private int numeroDiscos;

    public GameManager(int numeroDiscos) {
        this.numeroDiscos = numeroDiscos;
        torreA = new Stack();
        torreB = new Stack();
        torreC = new Stack();

        for (int i = numeroDiscos; i >= 1; i--) {
            torreA.push(i);
        }
    }

    public void startGame() {
        ConsoleUI ui = new ConsoleUI();
        while (torreC.size() < numeroDiscos) {
            ui.exibirTorres(torreA, torreB, torreC);
            char origem = ui.getInput("Escolha a torre de origem (A, B, C): ");
            char destino = ui.getInput("Escolha a torre de destino (A, B, C): ");

            Stack torreOrigem = getTorre(origem);
            Stack torreDestino = getTorre(destino);

            if (torreOrigem != null && torreDestino != null) {
                moverDisco(torreOrigem, torreDestino);
            } else {
                System.out.println("Torres inválidas!");
            }
        }
        System.out.println("Parabéns! Você concluiu o jogo.");
    }

    private Stack getTorre(char torre) {
        return switch (torre) {
            case 'A' -> torreA;
            case 'B' -> torreB;
            case 'C' -> torreC;
            default -> null;
        };
    }

    private boolean moverDisco(Stack origem, Stack destino) {
        if (!origem.isEmpty() && (destino.isEmpty() || origem.peek() < destino.peek())) {
            destino.push(origem.pop());
            return true;
        }
        System.out.println("Movimento inválido!");
        return false;
    }
}
