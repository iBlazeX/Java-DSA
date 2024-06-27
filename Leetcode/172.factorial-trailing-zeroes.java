/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        int a = 0;
        int x = 5;
        while (n/x>=1) {
            a += n/x;
            x *= 5;
        }
        return a;
    }
}
// @lc code=end

