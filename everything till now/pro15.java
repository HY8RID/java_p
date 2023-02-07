import java.util.Scanner;

public class pro15 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter day :");
        String dd = s.nextLine();
        System.out.print("Enter month :");
        String mm = s.nextLine();
        System.out.print("Enter year :");
        String yy = s.nextLine();

        System.out.println(dd + "/" + mm + "/" + yy);

    }
}
