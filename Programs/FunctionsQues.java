public class FunctionsQues {
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
        boolean a = palindromeCheck(23232);
        System.out.println(a);
    }
}

