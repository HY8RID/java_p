import java.util.Scanner;

public class pro20 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = s.nextInt();
        int r, sum = 0, temp = a;

        while (a > 0) {
            r = a % 10;
            sum = (sum * 10) + r;
            a = a / 10;
        }
        if (temp == sum) {
            System.out.print(temp + " is a palindrome number");
        } else {
            System.out.print(temp + " is not a palindrome number");
        }
    }
}
