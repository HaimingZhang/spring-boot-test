package com.hemming.daily.练习;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-29 18:53
 */
public class 层次遍历10 {

    public static void main(String[] args) {
        层次遍历10 test = new 层次遍历10();

        TreeNode h = new TreeNode(1);
        h.left = null;
        h.right = null;

        TreeNode g = new TreeNode(3);
        g.left = h;
        g.right = null;

        TreeNode i = new TreeNode(6);
        i.left = g;
        i.right = g;

        System.out.println(test.levelOrderBottom01(i));
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        int depth = depth(root);

        for (int i = depth; i >= 1; i--) {
            List<Integer> list = levelSearch(root, i, new ArrayList<>());
            res.add(list);
        }
        return res;
    }

    public List<Integer> levelSearch(TreeNode node, int level, List<Integer> ints) {
        if (node == null || level < 1) {
            return null;
        }

        if (level == 1) {
            ints.add(node.val);
        }

        levelSearch(node.left, level - 1, ints);

        levelSearch(node.right, level - 1, ints);
        return ints;
    }

    public int depth(TreeNode root) {
        return root == null ? 0 : Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public List<List<Integer>> levelOrderBottom01(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                list.add(poll.val);
            }
            res.add(0, list);
        }

        return res;
    }
}
