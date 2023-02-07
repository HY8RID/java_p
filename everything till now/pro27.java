import java.util.Scanner;

public class pro27 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range :");
        int a = s.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                b += i;
            }
        }
        System.out.println("Sum of numbers : " + b);
    }
}
