public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int a = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++) {
            if (nums[i] == val) {
                for (int j = i; j<n-1; j++) {
                    nums[j] = nums[j+1];
                }
            }
        }
        for (int i = 0; i<n; i++) {
            if (max<nums[i]) {
                max = nums[i];
                a = i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        removeElement(nums, 2);
    }
}
