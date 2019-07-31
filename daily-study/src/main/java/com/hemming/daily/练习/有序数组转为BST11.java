package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-30 11:06
 */
public class 有序数组转为BST11 {

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};

        有序数组转为BST11 test = new 有序数组转为BST11();
        TreeNode treeNode = test.sortedArrayToBST(arr);

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : toBst(nums, 0, nums.length - 1);
    }

    public TreeNode toBst(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int m = l + (r - l) / 2;

        TreeNode root = new TreeNode(nums[m]);
        root.left = toBst(nums, l, m - 1);
        root.right = toBst(nums, m + 1, r);
        return root;
    }

}
