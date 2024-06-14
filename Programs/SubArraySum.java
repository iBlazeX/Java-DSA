public class SubArraySum {
    public static void loop(int numbers[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<=numbers.length-1; i++) {
            for (int j=i; j<=numbers.length - 1; j++) {
                for (int k=i; k<=j; k++) {
                    sum = sum + numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.println("= " + sum);
                if (sum > max) {
                    max = sum;
                }
                if (sum < min && sum != 0) {
                    min = sum;
                }
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }


    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        loop(numbers);
    }
}


