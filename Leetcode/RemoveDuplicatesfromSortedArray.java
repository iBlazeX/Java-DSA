// 26. Remove Duplicates from Sorted Array

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int a = 0;
        int left = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++) {
            if (nums[left] == nums[i]) {
            }
            else {
            left++;
            nums[left] = nums[i];
            }
        }
        for (int i = 0; i<n; i++) {
            if (max<nums[i]) {
                max = nums[i];
                a = i;
            }
        }
        return a+1;
    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 3, 4, 4, 5};
        removeDuplicates(nums);
    }
}
