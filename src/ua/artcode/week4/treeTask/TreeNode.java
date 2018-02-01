package ua.artcode.week4.treeTask;

import java.util.List;

public class TreeNode {

    public int amount;
    public List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(int amount) {
        this.amount = amount;
    }

    public TreeNode(int amount, List<TreeNode> slaves) {
        this.amount = amount;
        this.children = slaves;
    }
}
