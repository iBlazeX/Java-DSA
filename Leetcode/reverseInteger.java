//Leetcode: 7. Reverse Integer

public class reverseInteger {
    public static int reverse(int a) {
        int rev = 0;
        int constr = (int) Math.pow(2, 31);
        if (a>constr || a < -constr || a==0) {
            return 0;
        }
        else if (a<0) {
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
        if (rev>constr || rev <-1*constr) {
            return 0;
        }
        return rev;
    }

    public static void main(String[] args) {
        int rev = reverse(4347);
        System.out.println(rev);
    }
}
