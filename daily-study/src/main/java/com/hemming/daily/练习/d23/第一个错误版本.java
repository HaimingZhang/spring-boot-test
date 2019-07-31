package com.hemming.daily.练习.d23;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-12 22:44
 */
public class 第一个错误版本 extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}
