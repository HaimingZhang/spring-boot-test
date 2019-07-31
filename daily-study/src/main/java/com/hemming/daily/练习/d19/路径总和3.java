package com.hemming.daily.练习.d19;

import com.hemming.daily.练习.TreeNode;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-06 17:38
 */
public class 路径总和3 {

    int count = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sumHandler(root, sum);

        pathSum(root.left, sum);

        pathSum(root.right, sum);

        return count;

    }

    public void sumHandler(TreeNode node, int sum) {
        if (node == null) {
            return;
        }

        if (node.val == sum) {
            count++;
        }

        sum -= node.val;

        sumHandler(node.left, sum);

        sumHandler(node.right, sum);

    }

}
