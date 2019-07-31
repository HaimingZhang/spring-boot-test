package com.hemming.daily.练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-28 23:06
 */
public class 对称二叉树10 {

    public static void main(String[] args) {
        对称二叉树10 test = new 对称二叉树10();
        TreeNode g = new TreeNode(3);
        g.left = null;
        g.right = null;

        TreeNode i = new TreeNode(6);
        i.left = g;
        i.right = g;

        System.out.println(test.isSymmetric(i));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return test(root.left, root.right);

    }

    public boolean test(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left != null && right != null && left.val == right.val) {
            return test(left.right, right.left) && test(left.left, right.right);
        } else {
            return false;
        }
    }


}
