package bintree;

public interface NodeOperationWithResult<T extends Comparable<T>> {
    T operate(Node<T> node);
}
