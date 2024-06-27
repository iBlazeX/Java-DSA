/*
 * @lc app=leetcode id=2574 lang=java
 *
 * [2574] Left and Right Sum Differences
 */

// @lc code=start
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int diff[] = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
            rightSum[n - (i + 1)] = rightSum[n - i] + nums[n-i];
        }
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return diff;
    }
}
// @lc code=end

