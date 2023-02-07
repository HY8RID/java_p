import java.util.Scanner;

class pro21 {
    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return (a * factorial(a - 1));
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int x = s.nextInt();
        int a = x;

        int c = factorial(x);
        System.out.print("Factorial of " + a + " is " + c);

    }
}
