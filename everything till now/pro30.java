public class pro30 {

    public static void one() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" $ ");
            }
            System.out.println("");
        }
    }

    public static void two() {
        int a = 0;
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                a = 3;
            }
            if (i % 2 == 1) {
                a = 4;
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + a + " ");
            }
            System.out.println("");
        }
    }

    public static void three() {
        int a = 0, b = 4;
        for (int i = a; i < b; i++) {
            for (int j = a; j < b; j++) {
                if (j == a || j == b - 1 || i == a || i == b - 1) {
                    System.out.print(" % ");
                } else {
                    System.out.print("   ");
                }
                // System.out.print(" % ");

            }

            System.out.println("");
        }
    }

    public static void main(String args[]) {
        System.out.println("===================1==============");
        one();
        System.out.println("===================2==============");
        two();
        System.out.println("===================3==============");
        three();
    }
}
