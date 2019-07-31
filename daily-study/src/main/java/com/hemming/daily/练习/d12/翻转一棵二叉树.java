package com.hemming.daily.练习.d12;

import com.hemming.daily.练习.TreeNode;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-01 21:44
 */
public class 翻转一棵二叉树 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }

        TreeNode left = root.left;

        root.left = invertTree(root.right);
        root.right = invertTree(left);

        return root;
    }


}
