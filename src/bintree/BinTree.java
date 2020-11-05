package bintree;

import java.util.ArrayList;

public class BinTree<T extends Comparable> {
    private ArrayList<T> nodes;

    public BinTree() {
        nodes = new ArrayList<T>();
    }


    public void insert(Node node, T value) {
        if (value.compareTo(node.value) < 0) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value.compareTo(node.value) > 0) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void printNodeDataRecursivelyInOrder(Node node) {
        if (node != null) {
            printNodeDataRecursivelyInOrder(node.left);
            System.out.print(" " + node.value);
            printNodeDataRecursivelyInOrder(node.right);
        }
    }

    public Integer addNodeDataRecursivelyInOrder(Node node) {
        if (node == null || node.value == null || !(node.value instanceof Integer)) {
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

    public void toList(Node rootNode) {
        Printer printer = (nodeToPrint) -> {
            printNodeDataRecursivelyInOrder(nodeToPrint);
        };
        printer.print(rootNode);
    }

    public void addAll(Node rootNode) {
        Printer printer = (nodeToPrint) -> {
            System.out.println(addNodeDataRecursivelyInOrder(nodeToPrint));
        };
        printer.print(rootNode);
    }
}
