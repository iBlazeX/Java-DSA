public class SearchInSortedMatrix {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int nr = matrix.length, nc = matrix[0].length;
        int row = 0, col = nc-1;
        while(row < nr && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("found key at ("+ row + "," + col +")");
                    return true;
            }

            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System. out.println("key not found!"); 
        return false;   
    }
    public static boolean revDiagonalSearch(int matrix[][], int key) {
        int nr = matrix.length, nc = matrix[0].length;
        int row = 0, col = nc-1;
        for (int i=0; i<nr && nc-i>0; i++)
            if (matrix[i][nc-1-i]<key) {
                if(i+1<nr && nc-2-i>=0 && matrix[i+1][nc-1-i]>key && matrix[i][nc-2-i]>key) {
                    row = i;
                    col = nc-1-i;
                }
            }
        while(row < nr && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("found key at ("+ row + "," + col +")");
                    return true;
            }

            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found!"); 
        return false;  
    }


    public static void main(String args []) {
        int matrix[][] = {{1}, {3}};

        int key = 3;
        revDiagonalSearch(matrix, key);
    }
}
