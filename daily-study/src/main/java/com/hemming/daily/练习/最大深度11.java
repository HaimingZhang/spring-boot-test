package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-29 18:03
 */
public class 最大深度11 {

    public static void main(String[] args) {
        最大深度11 test = new 最大深度11();
        TreeNode g = new TreeNode(3);
        g.left = null;
        g.right = null;

        TreeNode i = new TreeNode(6);
        i.left = g;
        i.right = g;

        System.out.println(test.maxDepth(i));
    }

    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = depth(root.left);

        int r = depth(root.right);

        return l > r ? l + 1 : r + 1;
    }

}
