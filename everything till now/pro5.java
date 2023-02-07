import java.util.Scanner;
public class pro5 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = s.nextInt();
        System.out.print("Enter number 2 :");
        int b = s.nextInt();
        int c;
        c = a * b;

        System.out.println("Product");
        System.out.println(a + " x " + b + " = " + c);
    }
    
}
