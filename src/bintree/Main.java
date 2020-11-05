package bintree;

public class Main {

    public static void main(String[] args) {
        BinTree<Integer> binTree = new BinTree();
        Node root = new Node(15);
        binTree.insert(root, 12);
        binTree.insert(root, 3);
        binTree.insert(root, 5);
        binTree.insert(root, 7);
        binTree.insert(root, 9);
        binTree.insert(root, 1);
        binTree.insert(root, 2);
        binTree.addAll(root);

//        BinTree<String> binTree = new BinTree();
//        Node root = new Node("test");
//        binTree.insert(root, "bla");
//        binTree.insert(root, "blub");
//        binTree.insert(root, "abcd");
//        binTree.insert(root, "bcd");
//        binTree.insert(root, "efg");
//        binTree.insert(root, "ks");
//        binTree.insert(root, "ls");
//        binTree.toList(root);


    }


}
