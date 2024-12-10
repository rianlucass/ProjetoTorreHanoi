package hanoi.model;

public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public void push(String disco) {
        Node newNode = new Node(disco);
        newNode.setNext(top);
        top = newNode;
    }

    public String pop() {
        if (top != null) {
            String disco = top.getDisco();
            top = top.getNext();
            return disco;
        }
        return null; // Caso a pilha esteja vazia
    }

    public String peek() {
        return (top != null) ? top.getDisco() : null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Node peekNode() {
        return top;
    }
}
