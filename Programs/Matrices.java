
import java.util.Scanner;


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


    public static void Spiral(int[][] n) {
        int nl = n.length;
        int counter = 0;
        int c = 0;
        int cx = nl-1;
        int r = 0;
        int rx = nl-1;
        int x;
        if (nl%2==0) {
            x = nl/2;
        }
        else {
            x = nl/2 +1;
        }
        for (int k = 1; k <= x; k++) {
            for (int i=c; i<=rx; i++) {
                n[r][i] = counter+1;
                counter++;
            }
            r++;
            for (int j = r; j<=cx; j++) {
                n[j][cx] = counter+1;
                counter++;
            }
            cx--;
            for (int i=cx; i>=r-1; i--) {
                n[rx][i] = counter+1;
                counter++;
            }
            rx--;
            for (int j = rx; j>c; j--) {
                n[j][c] = counter+1;
                counter++;
            }
            c++;
        }

        //output
        for (int i=0; i<nl; i++) {
            for(int j=0; j<nl; j++) {
                System. out.print(n[i][j] + " ");
            }
            System. out. println();
        }
    }


    public static void main(String[] args) {
        System.out.print("Please input rows and Columns: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int matrix[][] = new int [n][m];
            Spiral(matrix);
        }
    }
}