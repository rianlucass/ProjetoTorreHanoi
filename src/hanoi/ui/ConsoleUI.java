package java.hanoi.ui;

import java.hanoi.model.Stack;
import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirTorres(Stack torreA, Stack torreB, Stack torreC) {
        int altura = Math.max(torreA.size(), Math.max(torreB.size(), torreC.size()));

        for (int i = altura - 1; i >= 0; i--) {
            exibirDisco(torreA, i);
            System.out.print("   ");
            exibirDisco(torreB, i);
            System.out.print("   ");
            exibirDisco(torreC, i);
            System.out.println();
        }
        System.out.println("  A       B       C  ");
    }

    private void exibirDisco(Stack torre, int nivel) {
        int[] elementos = torre.toArray();
        if (nivel < elementos.length) {
            int tamanhoDisco = elementos[nivel];
            String disco = "=".repeat(tamanhoDisco * 2);
            System.out.printf("%" + (10 - tamanhoDisco) + "s%-" + (10 - tamanhoDisco) + "s", disco, disco);
        } else {
            System.out.print("    |    ");
        }
    }

    public char getInput(String mensagem) {
        System.out.print(mensagem);
        return scanner.next().toUpperCase().charAt(0);
    }
}
