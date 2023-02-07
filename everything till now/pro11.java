import java.util.Scanner;

public class pro11 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = s.nextInt();
        System.out.print("Enter number 2 :");
        int b = s.nextInt();
        System.out.print("Enter number 3 :");
        int c = s.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greater");
            if (b > c) {
                System.out.println(c + " is smaller");
            } else if (b == c) {
                System.out.println("values of b and c are equal");
            } else {
                System.out.println(b + " is smaller");
            }
        }

        else if (b > a && b > c) {
            System.out.println(b + " is greater");
            if (a > c) {
                System.out.println(c + " is smaller");
            } else if (a == c) {
                System.out.println("values of a and c are equal");
            } else {
                System.out.println(a + " is smaller");
            }
        }

        else if (c > a && c > b) {
            System.out.println(c + " is greater");
            if (a > b) {
                System.out.println(b + " is smaller");
            } else if (a == b) {
                System.out.println("values of a and b are equal");
            } else {
                System.out.println(a + " is smaller");
            }
        } else {
            System.out.println("all values are equal");
        }

    }
}
