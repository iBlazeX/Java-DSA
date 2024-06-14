

public class BinarySearch {
    public static int search(int numbers[], int key) {
        int start = 0; int end = numbers.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            //comparisions
            if(numbers[mid]==key) {
                return mid;
            }
            if (numbers[mid] > key) {
                end = mid - 1;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 8, 10, 15, 17, 24, 28, 37};
        int key = 2;
        System.out.println(search(numbers, key)); 
    }
    
}
