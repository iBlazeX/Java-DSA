public class Ques_2DArrays {

    public static int chekInt(int[][] n, int key) {
        int count = 0;
        for (int i=0; i<n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j]==key) {
                count++;
                }
            }
        }
        return count;
    }

    public static int sum2(int[][] n) {
        int sum = 0;
        for (int j=0; j<n[0].length; j++) {
            sum += n[1][j];
        }
        return sum;
    }

    public static int[][] transpose(int[][] n) {
        int Trans[][] = new int[n[0].length][n.length];
        for (int i=0; i<n[0].length; i++) {
            for (int j = 0; j < n.length; j++) {
                    Trans[i][j] = n[j][i];
            }
        }
        return Trans;
    }

    public static void output(int[][] n) {
        for (int i=0; i<n.length; i++) {
            for(int j=0; j<n[0].length; j++) {
                System. out.print(n[i][j] + " ");
            }
            System. out. println();
        }
    }


    public static void main(String[] args) {
        int arr[][] = {{4, 7, 8}, {8, 8, 7}};
        output(transpose(arr));
    }
}
