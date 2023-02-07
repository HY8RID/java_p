import java.util.Scanner;

public class pro15_fail {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a, b;

        System.out.print("Enter day :");
        int dd = s.nextInt();
        System.out.print("Enter month :");
        int mm = s.nextInt();
        System.out.print("Enter year :");
        int yy = s.nextInt();

        // leap year
        if ((yy % 400 == 0) || (yy % 100 != 0) && (yy % 4 == 0)) {
            if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
                if (dd < 1 || dd > 31) {
                    System.out.print("Please Enter Correct Day :");
                    dd = s.nextInt();
                } else {
                    if (dd == 1 || dd == 21 || dd == 31) {
                        a = dd + "st";
                    } else if (dd == 2 || dd == 22) {
                        a = dd + "nd";
                    } else if (dd == 3 || dd == 23) {
                        a = dd + "rd";
                    } else {
                        a = dd + "th";
                    }

                }
            } else if (mm == 2) {
                if (dd < 1 || dd > 29) {
                    System.out.print("Please Enter Correct Day :");
                    dd = s.nextInt();
                } else {
                    if (dd == 1 || dd == 21) {
                        a = dd + "st";
                    } else if (dd == 2 || dd == 22) {
                        a = dd + "nd";
                    } else if (dd == 3 || dd == 23) {
                        a = dd + "rd";
                    } else {
                        a = dd + "th";
                    }
                }
            } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
                if (dd < 1 || dd > 30) {
                    System.out.print("Please Enter Correct Day :");
                    dd = s.nextInt();
                } else {
                    if (dd == 1 || dd == 21) {
                        a = dd + "st";
                    } else if (dd == 2 || dd == 22) {
                        a = dd + "nd";
                    } else if (dd == 3 || dd == 23) {
                        a = dd + "rd";
                    } else {
                        a = dd + "th";
                    }

                }
            } else {
                System.out.print("Please Enter Correct Month :");
                mm = s.nextInt();
            }
        }

        // not a leap year
        else {
            if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
                if (dd < 1 || dd > 31) {
                    System.out.print("Please Enter Correct Day :");
                    dd = s.nextInt();
                } else {
                    if (dd == 1 || dd == 21 || dd == 31) {
                        a = dd + "st";
                    } else if (dd == 2 || dd == 22) {
                        a = dd + "nd";
                    } else if (dd == 3 || dd == 23) {
                        a = dd + "rd";
                    } else {
                        a = dd + "th";
                    }

                }
            } else if (mm == 2) {
                if (dd < 1 || dd > 28) {
                    System.out.print("Please Enter Correct Day :");
                    dd = s.nextInt();
                } else {
                    if (dd == 1 || dd == 21) {
                        a = dd + "st";
                    } else if (dd == 2 || dd == 22) {
                        a = dd + "nd";
                    } else if (dd == 3 || dd == 23) {
                        a = dd + "rd";
                    } else {
                        a = dd + "th";
                    }
                }
            } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
                if (dd < 1 || dd > 30) {
                    System.out.print("Please Enter Correct Day :");
                    dd = s.nextInt();
                } else {
                    if (dd == 1 || dd == 21) {
                        a = dd + "st";
                    } else if (dd == 2 || dd == 22) {
                        a = dd + "nd";
                    } else if (dd == 3 || dd == 23) {
                        a = dd + "rd";
                    } else {
                        a = dd + "th";
                    }

                }
            } else {
                System.out.print("Please Enter Correct Month :");
                mm = s.nextInt();
            }

        }
        System.out.println(a + mm + yy);
    }
}
