package com.hemming.daily.练习.d17;

import com.hemming.daily.练习.TreeNode;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-06 17:16
 */
public class 合并二叉树 {

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);

        TreeNode t1_l = new TreeNode(3);

        t1_l.left = new TreeNode(5);

        TreeNode t1_r = new TreeNode(2);

        t1.left = t1_l;

        t1.right = t1_r;

        TreeNode t2 = new TreeNode(2);

        TreeNode t2_l = new TreeNode(1);

        t2_l.right = new TreeNode(4);

        TreeNode t2_r = new TreeNode(3);

        t2_r.right = new TreeNode(7);

        t2.left = t2_l;

        t2.right = t2_r;

        合并二叉树 test = new 合并二叉树();

        test.mergeTrees(t1, t2);


    }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 == null) {
            return t2;
        }

        if (t2 == null) {
            return t1;
        }

        TreeNode root = new TreeNode(t1.val + t2.val);

        root.left = mergeTrees(t1.left, t2.left);

        root.right = mergeTrees(t1.right, t2.right);

        return root;

    }
}
