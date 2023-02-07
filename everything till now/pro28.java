import java.util.Scanner;

public class pro28 {
    public static double circle() {
        double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of a circle :");
        int a = s.nextInt();
        double b = pi * (a * a);
        return b;
    }

    public static int rectangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of a rectangle :");
        int l = s.nextInt();
        System.out.print("Enter breadth of a rectangle :");
        int b = s.nextInt();
        int c = l * b;
        return c;
    }

    public static int square() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of a square :");
        int side = s.nextInt();

        int c = side * side;
        return c;
    }

    public static void main(String args[]) {

        System.out.println("1. Area of a Circle");
        System.out.println("2. Area of a Rectangle");
        System.out.println("3. Area of a Square \n");

        Scanner s = new Scanner(System.in);
        System.out.print("Calculate the area of :");
        int a = s.nextInt();
        switch (a) {
            case 1:
                double x = circle();
                System.out.println("Area of a circle :" + x);
                break;
            case 2:
                int y = rectangle();
                System.out.println("Area of a rectangle :" + y);
                break;
            case 3:
                int z = square();
                System.out.println("Area of a square :" + z);
                break;
            default:
                System.out.println("Please enter valid input");
                break;
        }

    }
}