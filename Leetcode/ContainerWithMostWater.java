//Leetcode: 11. Container With Most Water

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int sum;
        int max = 0;
        int min;
        for (int i=0; i<height.length; i++) {
            for (int j = i; j < height.length; j++) {
                min = Math.min(height[i], height[j]);
                sum = min*(j-i);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
