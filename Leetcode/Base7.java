// 504. Base 7

public class Base7 {
    public static String convertToBase7(int n) {
        StringBuilder sb = new StringBuilder("");
        Boolean negative = false;
        if (n < 0) {
            n = -n;
            negative = true;
        }
        else if (n==0) {
            sb.append("0");
        }
        while (n > 0) {
            if (n%7 == 0) {
                n /= 7;
                sb.insert(0, 0);
            }
            else {
                int i = 0;
                while (n%7 != 0) {
                    n--;
                    i++;
                }
                sb.insert(0, i);
                n /= 7;
            }
        }
        if (negative) {
            sb.insert(0, "-");
        }
        String str = sb.toString();
        return str;
    }


    public static void main(String[] args) {
        int n = 100;
        System.out.println(convertToBase7(n));
    }
}
