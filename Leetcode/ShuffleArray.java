public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        for (int i = 0, a=0; i < n; i++, a+=2) {
            arr[a] = nums[i];
            arr[a+1] = nums[n+i+1];
        }
        return arr;
    }
}
