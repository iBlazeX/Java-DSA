import java.util.*;

public class BasicSortingTest {
    public static int[] bubble(int n[]) {
        int l = n.length;
        for (int i=0; i<l-1; i++) {
            for (int j=0; j<l-1-i; j++) {
                if (n[j] < n[j+1]) {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        return n;
    }

    public static int[] selection(int n[]) {
        int l = n.length;
        for (int i=0; i<l-1; i++) {
            int minPos = i;
            for (int j=i+1; j<l; j++) {
                if (n[minPos] < n[j]) {
                    minPos = j;
                }
            }
            int temp = n[minPos];
            n[minPos] = n[i];
            n[i] = temp;
        }
        return n;
    }

    

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int a[] = selection(arr);
        System.out.print(Arrays.toString(a));
    }
}
