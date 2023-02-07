import java.util.Scanner;

public class pro25 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting range :");
        int a = s.nextInt();
        System.out.print("Enter ending range :");
        int b = s.nextInt();
        int c = 0;
        for (int i = a; i <= b; i++) {
            c += i;
        }
        System.out.println("Sum of numbers : " + c);
    }
}
