package bintree;

public interface NodeTraverser<T extends Comparable<T>> {
    void traverse(Node<T> node);
}
