

public class DiagonalSum {
    public static void Sum(int[][] n) {
        int nl = n[0].length;
        int sum = 0;
        for (int i=0; i<nl; i++) {
            sum += n[i][i];
            if (i == nl-i-1) {
                continue;
            }
            sum += n[i][nl-i-1];
        }
        

        //output
        for (int i=0; i<nl; i++) {
            for(int j=0; j<nl; j++) {
                System. out.print(n[i][j] + " ");
            }
            System. out. println();
        }
        System.out.println();
        System.out.print(sum);
    }


    public static void main(String[] args) {
            int matrix[][] = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}};
            Sum(matrix);
    }
}
