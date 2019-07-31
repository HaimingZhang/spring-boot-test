package com.hemming.daily.练习.d16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-05 22:52
 */
public class 找到所有数组中消失的数字 {

    public static void main(String[] args) {
        找到所有数组中消失的数字 test = new 找到所有数组中消失的数字();

        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(test.findDisappearedNumbers(arr));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[(nums[i] - 1) % n] += n;
        }
        List<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                list.add(i + 1);
            }
        }
        return list;
    }

}
