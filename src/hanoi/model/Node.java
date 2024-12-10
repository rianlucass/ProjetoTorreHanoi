package java.hanoi.model;

public class Node {
    public int tamanho;
    public Node proximo;

    public Node(int tamanho) {
        this.tamanho = tamanho;
        this.proximo = null;
    }
}
