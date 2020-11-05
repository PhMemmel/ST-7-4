package bintree;

public class Node<T extends Comparable> {

    T value;
    Node left;
    Node right;

    public Node() {
        left = null;
        right = null;
    }
    public Node(T value) {
        this.value = value;
        left = null;
        right = null;
    }




}
