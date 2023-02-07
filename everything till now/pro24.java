import java.util.Scanner;

public class pro24 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range :");
        int a = s.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            b += i;
        }
        System.out.println("Sum of numbers : " + b);
    }
}
