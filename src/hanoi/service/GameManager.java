package hanoi.service;

import hanoi.model.Stack;
import hanoi.model.Node;

public class GameManager {
    private Stack pilhaA;
    private Stack pilhaB;
    private Stack pilhaC;

    public GameManager() {
        pilhaA = new Stack();
        pilhaB = new Stack();
        pilhaC = new Stack();
    }

    public void inicializarDiscos() {
        pilhaA.push("vermelho");
        pilhaA.push("branco");
        pilhaA.push("azul");
    }

    public void moverDisco(char de, char para) {
        Stack origem = getPilha(de);
        Stack destino = getPilha(para);

        if (origem != null && !origem.isEmpty()) {
            String disco = origem.pop();
            if (destino.isEmpty() || maiorDisco(disco, destino.peek())) {
                destino.push(disco);
                System.out.println("Movendo disco " + disco + " de " + de + " para " + para);
            } else {
                origem.push(disco);
                System.out.println("Movimento inválido: disco maior não pode ir para a pilha com disco menor.");
            }
        }
    }

    public boolean maiorDisco(String disco1, String disco2) {
        if (disco1.equals("azul") && !disco2.equals("azul")) {
            return true;
        } else if (disco1.equals("branco") && disco2.equals("vermelho")) {
            return true;
        } else if (disco1.equals("vermelho") && !disco2.equals("vermelho")) {
            return false;
        }
        return false;
    }



    public Stack getPilha(char nome) {
        switch (nome) {
            case 'A': return pilhaA;
            case 'B': return pilhaB;
            case 'C': return pilhaC;
            default: return null;
        }
    }

    public void exibirPilhass() {
        exibirPilha(pilhaA, 'A');
        exibirPilha(pilhaB, 'B');
        exibirPilha(pilhaC, 'C');
    }

    private void exibirPilha(Stack pilha, char nome) {
        System.out.println("Pilha " + nome);
        Node temp = pilha.peekNode();
        System.out.println("      |      ");
        while (temp != null) {
            System.out.println("|==" + temp.getDisco() + "==|");
            temp = temp.getNext();
        }
        System.out.println("______|______\n\n\n");
    }
}
