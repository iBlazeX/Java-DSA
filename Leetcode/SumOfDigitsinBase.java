//1837. Sum of Digits in Base K

public class SumOfDigitsinBase {
    public static int sumBase(int n, int base) {
        int sum = 0;
        while (n > 0) {
            if (n%base == 0) {
                n /= base;
            }
            else {
                sum += n%base;
                n -= n%base;
                n /= base;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 10;
        System.out.println(sumBase(n, k));
    }
}
