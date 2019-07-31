package com.hemming.daily.练习.d24;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-13 23:33
 */
public class 搜索二维矩阵2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
