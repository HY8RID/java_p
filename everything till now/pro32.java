public class pro32 {
    public static void one() {
        for (int i = 1; i <= 10; i++) {
            int a = i * i;
            System.out.print(a + " ");
        }
    }

    public static void two() {
        for (int i = 1; i <= 10; i++) {
            int a = i * i * i;
            System.out.print(a + " ");
        }
    }

    public static void three() {
        for (int i = 1; i <= 10; i++) {
            int a = (i * i) + 1;
            System.out.print(a + " ");
        }
    }

    public static void four() {
        int a = 8, b = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            b = 4 * i;
            a = a + b;
        }
    }

    public static void five() {
        int a = 5, b;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.print(a + " ");
                b = 11 * i;
                a = a + b;
            }
        }
    }

    public static void six() {
        int a = 22;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(a + " ");
                a = a + 2;
            }
            if (i % 2 == 1) {
                System.out.print(a + " ");
                a = a - 1;
            }

        }
    }

    public static void main(String args[]) {
        System.out.println("\n\n===================1==============");
        one();
        System.out.println("\n\n===================2==============");
        two();
        System.out.println("\n\n===================3==============");
        three();
        System.out.println("\n\n===================4==============");
        four();
        System.out.println("\n\n===================5==============");
        five();
        System.out.println("\n\n===================6==============");
        six();
    }
}
