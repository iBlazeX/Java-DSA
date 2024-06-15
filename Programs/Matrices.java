import java.util.*;

public class Matrices {

    public static String MinMax(int[][] n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n[0].length; i++) {
            for (int j = 0; j < n.length; j++) {
                max = Math.max(max, n[i][j]);
                min = Math.min(min, n[i][j]);
            }
        }
        return max + " " + min;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    matrix [i][j] = sc.nextInt();
                }
            }
        }
        System.out.println(MinMax(matrix));
    }
}