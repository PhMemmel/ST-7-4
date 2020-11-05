package bintree;

public class BinTree<T extends Comparable<T>> {

    public BinTree() {
    }


    public void insert(Node<T> node, T value) {
        if (value.compareTo(node.value) < 0) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Eingefuegt: " + value + " links von " + node.value);
                node.left = new Node<>(value);
            }
        } else if (value.compareTo(node.value) > 0) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Eingefuegt: " + value + " rechts von "
                        + node.value);
                node.right = new Node<>(value);
            }
        }
    }

    public void traverse(Node<T> node, NodeOperation<T> nodeOperation) {
        if (node != null) {
            traverse(node.left, nodeOperation);
            nodeOperation.operate(node);
            traverse(node.right, nodeOperation);
        }
    }

    public int traverseWithResult(Node<T> node, NodeOperationWithResult<T> nodeOperation) {
        if (node != null) {
            return (Integer) nodeOperation.operate(node) + traverseWithResult(node.left, nodeOperation) + traverseWithResult(node.right, nodeOperation);
        } else return 0;
    }

    public void toList(Node<T> node) {
        NodeOperation<T> nodeOperation = (nodeToCall) -> System.out.print(nodeToCall.value + " ");
        traverse(node, nodeOperation);

    }

    public void addAll(Node<T> node) {
        NodeOperationWithResult<T> nodeOperationWithResult;
        nodeOperationWithResult = (nodeToCall) -> nodeToCall.value;
        System.out.println(traverseWithResult(node, nodeOperationWithResult));

    }
}
