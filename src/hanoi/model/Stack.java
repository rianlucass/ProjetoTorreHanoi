package java.hanoi.model;

public class Stack {
    private Node topo;

    public Stack() {
        this.topo = null;
    }

    public void push(int tamanho) {
        Node novo = new Node(tamanho);
        novo.proximo = topo;
        topo = novo;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        int tamanho = topo.tamanho;
        topo = topo.proximo;
        return tamanho;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return topo.tamanho;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        int contador = 0;
        Node atual = topo;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }

    public int[] toArray() {
        int[] elementos = new int[size()];
        Node atual = topo;
        int i = 0;
        while (atual != null) {
            elementos[i++] = atual.tamanho;
            atual = atual.proximo;
        }
        return elementos;
    }
}
