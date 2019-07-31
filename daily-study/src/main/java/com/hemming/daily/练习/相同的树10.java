package com.hemming.daily.练习;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-28 22:31
 */
public class 相同的树10 {

    public static void main(String[] args) {
        TreeNode g = new TreeNode(3);
        g.left = null;
        g.right = null;

        TreeNode i = new TreeNode(6);
        i.left = g;
        i.right = null;


        TreeNode c = new TreeNode(6);
        c.left = null;
        c.right = g;

        System.out.println(isSameTree(i, c));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return Objects.equals(getFromTreeByFirst(p), getFromTreeByFirst(q));
        }

        return false;
    }

    public static List<Integer> getFromTreeByFirst(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        fistGet(list, node);
        return list;
    }

    public static void fistGet(List<Integer> list, TreeNode node) {
        list.add(node.val);

        if (node.left != null) {
            fistGet(list, node.left);
        } else {
            if (node.right != null) {
                list.add(null);
            }

        }

        if (node.right != null) {
            fistGet(list, node.right);
        }

    }
}
