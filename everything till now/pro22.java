import java.util.Scanner;

public class pro22 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range :");
        int a = s.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
