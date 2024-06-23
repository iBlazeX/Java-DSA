
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        try (Scanner ch = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            n = ch.nextInt();
        }
        if (n%400 == 0 || (n%4 == 0 && n%100 != 0)) {
            System.out.println("Year " + n + " is a leap year");
        }
        else {
            System.out.println("Year " + n + " is not a leap year");
        }
    }

}
