package Composite;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode node = new TreeNode("B");
        TreeNode node1 = new TreeNode("c");

        node.add(node1);
        tree.root.add(node);

    }
}
