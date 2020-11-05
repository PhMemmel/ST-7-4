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

        BinTree<String> binTree2 = new BinTree();
        Node root2 = new Node("test");
        binTree2.insert(root2, "bla");
        binTree2.insert(root2, "blub");
        binTree2.insert(root2, "abcd");
        binTree2.insert(root2, "bcd");
        binTree2.insert(root2, "efg");
        binTree2.insert(root2, "ks");
        binTree2.insert(root2, "ls");
        binTree2.toList(root2);


    }


}
