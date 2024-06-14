
import java.util.Scanner;

public class PrimeInRange {

    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 2; i <= n; i++) {
                if (isPrime(i) == true) {
                    System.out.print(i + " ");
                }
                
            }
        }
    }
}