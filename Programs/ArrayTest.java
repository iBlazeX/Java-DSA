public class ArrayTest {
    public static boolean repeat(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void sum(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int nums[] = {-1, -2, 3, -4, 6, 5, 4};
        sum(nums);
    }
}
