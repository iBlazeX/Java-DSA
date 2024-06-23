public class Butterfly_Pattern {
    
    public static void star(int a, String b) {
        for (int j = 1; j <= a; j++) {
                System.out.print(b);
            }
    }
    
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            star(i, "*");
            star(2*(n-i), " ");
            star(i, "*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            star(i, "*");
            star(2*(n-i), " ");
            star(i, "*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }
}

