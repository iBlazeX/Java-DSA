public class convertToBase {
    public static String convert(int n, int base) {
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
            if (n%base == 0) {
                n /= base;
                sb.insert(0, 0);
            }
            else {
                int i = n%base;
                n -= i;   
                sb.insert(0, i);
                n /= base;
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
        System.out.println(convert(n, 2));
    }
}
