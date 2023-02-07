import java.util.Scanner;

public class pro10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = s.nextInt();
        System.out.print("Enter number 2 :");
        int b = s.nextInt();

        if (a > b) {
            System.out.println(a + " is greater");
            System.out.println(b + " is smaller");
        } else if (b > a) {
            System.out.println(b + " is greater");
            System.out.println(a + " is smaller");
        } else {
            System.out.println("Values are equal");
        }

    }
}
