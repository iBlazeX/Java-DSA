public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int out[] = new int[2];
        for (int i = 0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++ ) {
                if (nums[i] + nums[j] == target && i != j) {
                    out[0] = i;
                    out[1] = j;
                    
                }
            }
        }
        return out;
    }
}

