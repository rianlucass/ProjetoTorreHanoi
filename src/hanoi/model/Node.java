package hanoi.model;

public class Node {
    private String disco;
    private Node next;

    public Node(String disco) {
        this.disco = disco;
        this.next = null;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
