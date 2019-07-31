package com.hemming.daily.练习.d18;

import com.hemming.daily.练习.TreeNode;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-07 21:33
 */
public class 把二叉搜索树转换为累加树 {
    public static void main(String[] args) {

    }

    public TreeNode convertBST(TreeNode root) {
        addValue(root);
        return root;
    }

    int sum = 0;

    public void addValue(TreeNode node) {
        if (node == null) {
            return;
        }

        addValue(node.right);

        node.val += sum;

        sum = node.val;

        addValue(node.left);
    }
}
