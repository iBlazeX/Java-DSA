import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int a = 1;
            int y = 0;
            do {a++;
                if (n%a == 0) {
                    y = 2;
                    break;
                } else if ((n%a != 0 || n == 2) && n != 1)
                    y = 1;
            } while (Math.sqrt(n) > a);
            if (y == 1) {
                System.out.println(n + " is Prime");
            }
            else {
                System.out.println(n + " is Not Prime");
            }
        }
    }
}
