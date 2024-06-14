public class Patterns2 {
        public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void holbus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 1; j<= n; j++) {
                if (i==1 || i == n || j==1 || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void rev_palindromic_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rev_palindromic_pyramid(5);
    }

}

