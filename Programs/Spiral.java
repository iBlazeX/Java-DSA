import java.util.Scanner;

public class Spiral {
    
    public static void Spiralx(int[][] n) {
        int nr = n.length;
        int nc = n[0].length;
        int counter = 0;
        int c = 0;
        int cx = nc-1;
        int r = 0;
        int rx = nr-1;
        while (counter < nr*nc) {
            for (int i=c; i<=cx; i++) {
                n[r][i] = counter+1;
                counter++;
            }
            for (int j = r+1; j<=rx; j++) {
                n[j][cx] = counter+1;
                counter++;
            }
            for (int i=cx-1; i>=c; i--) {
                if(r == rx) {
                    continue;
                }
                n[rx][i] = counter+1;
                counter++;
            }
            for (int j = rx-1; j>=r+1; j--) {
                if(c == cx) {
                    continue;
                }
                n[j][c] = counter+1;
                counter++;
            }
            r++;
            cx--;
            rx--;
            c++;
        }

        //output
        for (int i=0; i<nr; i++) {
            for(int j=0; j<nc; j++) {
                System. out.print(n[i][j] + " ");
            }
            System. out. println();
        }
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow] [j]+" ");
            }

            //right
            for(int i=startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i] [endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j -- ) {
                if(startRow == endRow) {
                return;
            }
                System.out.print(matrix[endRow] [j]+" ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i -- ) {
                if(startCol == endCol) {
                    return;
                }
                System.out.print(matrix[i] [startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol --;
            endRow --;
        }
    }
    public static void main(String[] args) {
        System.out.print("Please input rows and Columns: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int matrix[][] = new int [n][m];
            int mat[][] = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}};
            Spiralx(matrix);
        }
    }
}

