/*
 * @lc app=leetcode id=319 lang=java
 *
 * [319] Bulb Switcher
 */

// @lc code=start
class Solution {

    public int bulbSwitch(int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append('0');
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j += i + 1) {
                if (sb.charAt(j) == '0') {
                    sb.setCharAt(j, '1');
                } else {
                    sb.setCharAt(j, '0');
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == '1') {
                count++;
            }
        }
        return count;

    }
}
// @lc code=end

