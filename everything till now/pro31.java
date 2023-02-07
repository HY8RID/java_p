public class pro31 {
    public static void one() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    public static void two() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j) {
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    public static void three() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j) {
                    System.out.print((j + 1) + " ");
                } else {
                    System.out.print("   ");
                }
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
