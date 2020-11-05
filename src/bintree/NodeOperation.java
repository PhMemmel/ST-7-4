package bintree;

public interface NodeOperation<T extends Comparable<T>> {
    void operate(Node<T> node);
}
