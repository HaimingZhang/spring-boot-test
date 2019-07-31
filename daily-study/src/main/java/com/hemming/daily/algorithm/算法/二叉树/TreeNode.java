package com.hemming.daily.algorithm.算法.二叉树;

/**
 * Created by hmzhang on 2018/8/17.
 */
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void printNode(TreeNode node) {
        System.out.println(node.getValue());
    }

    public void theFirst(TreeNode root) {
        printNode(root);
        if (root.getLeft() != null) {
            theFirst(root.getLeft());
        }
        if (root.getRight() != null) {
            theFirst(root.getRight());
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(8, null, null);
        TreeNode b = new TreeNode(2, null, null);
        TreeNode c = new TreeNode(4, null, null);
        TreeNode d = new TreeNode(7, null, a);
        TreeNode e = new TreeNode(5, c, null);
        TreeNode f = new TreeNode(1, null, b);
        TreeNode g = new TreeNode(3, f, e);
        TreeNode h = new TreeNode(9, d, null);
        TreeNode i = new TreeNode(6, g, h);

        i.theFirst(i);
    }


}
