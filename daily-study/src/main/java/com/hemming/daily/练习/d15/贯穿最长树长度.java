package com.hemming.daily.练习.d15;

import com.hemming.daily.练习.TreeNode;
import com.hemming.daily.练习.最大深度11;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-04 19:46
 */
public class 贯穿最长树长度 {

    public static void main(String[] args) {
        贯穿最长树长度 test = new 贯穿最长树长度();
        TreeNode g = new TreeNode(3);
        g.left = null;
        g.right = null;

        TreeNode i = new TreeNode(6);
        i.left = g;
        i.right = g;

        System.out.println(test.getMax(i));
    }

    int r = 0;

    public int getMaxLength(TreeNode treeNode) {
        getMax(treeNode);
        return r;
    }



    public int getMax(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getMax(root.left);

        int right = getMax(root.right);

        r = Math.max(r, left + right);

        return Math.max(left, right) + 1;

    }
}
