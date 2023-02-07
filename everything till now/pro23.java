import java.util.Scanner;

public class pro23 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range :");
        int a = s.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}