//Leetcode: 7. Reverse Integer

public class reverseInteger {
    public static int reverse(int a) {
        long rev = 0;
        if (a<0) {
            a = -a;
            for (int i = 10; a >= 1; a /= 10) {
                int b = a%i;
                rev = rev*10 + b;
            }
            rev = -rev;

        }
        else {
            for (int i = 10; a >= 1; a /= 10) {
                int b = a%i;
                rev = rev*10 + b;
            }
        }
        int constr = (int)Math.pow(2,31);
        if (rev>constr || rev <-1*constr) {
            return 0;
        }
        return (int)rev;
    }

    public static void main(String[] args) {
        int rev = reverse(4347);
        System.out.println(rev);
    }
}
