import java.util.Scanner;

public class NestedLoops { 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            char a = 'a';
            for (int i = 1; i <= n; i++) {
                for (int j=1; j <= i; j++) {
                    System.out.print(a);
                    a++;
                }
                System.out.println();
            }
        }

    }
}

