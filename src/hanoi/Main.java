package java.hanoi;

import java.hanoi.service.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager game = new GameManager(4);
        game.startGame();
    }
}

