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

    public void printNodeDataRecursivelyInOrder(Node<T> node) {
        if (node != null) {
            printNodeDataRecursivelyInOrder(node.left);
            System.out.print(" " + node.value);
            printNodeDataRecursivelyInOrder(node.right);
        }
    }

    public Integer addNodeDataRecursivelyInOrder(Node<T> node) {
        if (node == null || !(node.value instanceof Integer)) {
            System.out.println("Fehler, Datentyp ist nicht addierbar");
            return -1;
        }

        if (node.left == null && node.right==null) {
            return (Integer) node.value;
        } else if (node.left != null && node.right != null) {
            return (Integer) node.value + addNodeDataRecursivelyInOrder(node.left) + addNodeDataRecursivelyInOrder(node.right);

        } else if (node.left != null) {
            return (Integer) node.value + addNodeDataRecursivelyInOrder(node.left);
        } else {
            return (Integer) node.value + addNodeDataRecursivelyInOrder(node.right);
        }
    }

    public void toList(Node<T> rootNode) {
        NodeTraverser<T> nodeTraverser = (nodeToPrint) -> printNodeDataRecursivelyInOrder(nodeToPrint);
        nodeTraverser.traverse(rootNode);
    }

    public void addAll(Node<T> rootNode) {
        NodeTraverser<T> nodeTraverser = (nodeToPrint)
                -> System.out.println("Die Summe aller Node-Eintraege ist " + addNodeDataRecursivelyInOrder(nodeToPrint));
        nodeTraverser.traverse(rootNode);
    }
}
