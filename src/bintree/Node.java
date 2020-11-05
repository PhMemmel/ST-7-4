package bintree;

public class Node<T extends Comparable<T>> {

    T value;
    Node<T> left;
    Node<T> right;

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
