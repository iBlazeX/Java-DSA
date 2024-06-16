import java.util.Scanner;

public class SpiralSq {
    
    public static void Spiralx(int[][] n) {
        int nl = n.length;
        int counter = 0;
        int c = 0;
        int cx = nl-1;
        int r = 0;
        int rx = nl-1;
        while (counter < nl*nl) {
            for (int i=c; i<=rx; i++) {
                n[r][i] = counter+1;
                counter++;
            }
            for (int j = r+1; j<=cx; j++) {
                n[j][cx] = counter+1;
                counter++;
            }
            for (int i=cx-1; i>r; i--) {
                n[rx][i] = counter+1;
                counter++;
            }
            for (int j = rx; j>c; j--) {
                n[j][c] = counter+1;
                counter++;
            }
            r++;
            cx--;
            rx--;
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
        System.out.print("Please input a value: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            Spiralx(matrix);
        }
    }
}

