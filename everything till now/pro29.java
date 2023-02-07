import java.util.Scanner;

public class pro29 {
    // circle
    public static double circleA() {
        double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of a circle :");
        int a = s.nextInt();
        double b = pi * (a * a);
        return b;
    }

    public static double circleP() {
        double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of a circle :");
        int a = s.nextInt();
        double b = 2 * pi * a;
        return b;
    }

    // Rectangle
    public static int rectangleA() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of a rectangle :");
        int l = s.nextInt();
        System.out.print("Enter breadth of a rectangle :");
        int b = s.nextInt();
        int c = l * b;
        return c;
    }

    public static int rectangleP() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of a rectangle :");
        int l = s.nextInt();
        System.out.print("Enter breadth of a rectangle :");
        int b = s.nextInt();
        int c = 2 * (l + b);
        return c;
    }

    // Square
    public static int squareA() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of a square :");
        int side = s.nextInt();

        int c = side * side;
        return c;
    }

    public static int squareP() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of a square :");
        int side = s.nextInt();

        int c = 4 * side;
        return c;
    }

    public static int choice(int a) {
        String b = "";
        if (a == 1) {
            b = "Circle";
        } else if (a == 2) {
            b = "Rectangle";
        } else if (a == 3) {
            b = "Square";
        }

        System.out.println("a.Area of a " + b);
        System.out.println("b.Parameter of a " + b);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input :");
        char ch = s.next().charAt(0);

        return ch;
    }

    public static void main(String args[]) {

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square \n");

        Scanner s = new Scanner(System.in);
        System.out.print("Calculate the area of :");
        int a = s.nextInt();
        switch (a) {
            case 1:
                int x = choice(a);
                switch (x) {
                    case 'a':
                        double m = circleP();
                        System.out.println("Area of a circle :" + m);
                        break;
                    case 'b':
                        double n = circleP();
                        System.out.println("Parameter of a circle :" + n);
                        break;
                }
                break;
            case 2:
                int y = choice(a);
                switch (y) {
                    case 'a':
                        int o = rectangleA();
                        System.out.println("Area of a rectangle :" + o);
                        break;
                    case 'b':
                        int p = rectangleP();
                        System.out.println("Parameter of a rectangle :" + p);
                        break;
                }
                break;
            case 3:
                int z = choice(a);
                switch (z) {
                    case 'a':
                        int q = squareA();
                        System.out.println("Area of a square :" + q);
                        break;
                    case 'b':
                        int r = squareP();
                        System.out.println("Parameter of a square :" + r);
                        break;
                }
                break;
            default:
                System.out.println("Please enter valid input");
                break;
        }

    }
}