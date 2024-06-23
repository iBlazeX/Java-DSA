import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int i = 1;
            String str = "*";
            while (i <= n) { 
                String repeat = str.repeat(i);
                System.out.println(repeat);
                i++;
            }
        }

    }
}

