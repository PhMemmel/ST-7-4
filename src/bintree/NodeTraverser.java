package bintree;

public interface NodeTraverser<T extends Comparable> {
    void traverse(Node<T> node);
}
