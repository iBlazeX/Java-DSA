//Leetcode: 11. Container With Most Water

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int sum;
        int max = 0;
        int min;
        for (; left<right;) {
            min = Math.min(height[left], height[right]);
            sum = min*(right-left);
            max = Math.max(max, sum);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
           
        }
        return max;
    }
}
