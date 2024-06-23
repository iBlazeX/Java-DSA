public class Palindrome {
    public static boolean palindromeCheck(int a) {
        int rev = 0;
        int c = a;
        for (int i = 10; a >= 1; a /= 10) {
            int b = a%i;
            rev = rev*10 + b;
        }
        return rev == c;
    }
    public static void main(String[] args) {
        boolean a = palindromeString2("arhra");
        System.out.println(a);
    }
    
    public static boolean palindromeString(String a) {
        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }
        return a.equals(rev);
    }

    public static boolean palindromeString2(String a) {
        int n = a.length();
        for (int i = 0; i < a.length()/2; i++) {
            if (a.charAt(i) != a.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
}

