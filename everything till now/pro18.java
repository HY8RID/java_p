import java.util.Scanner;

public class pro18 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            b = a;
            System.out.print("Enter number :");
            a = s.nextInt();
            a = b + a;
            System.out.print("Number is:" + a);
            System.out.println();

        }

    }
}