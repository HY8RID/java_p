import java.util.Scanner;
public class pro8 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER MARKS BELOW");
        System.out.print("Subject 1 (JAVA) :");
        int a = s.nextInt();
        System.out.print("Subject 2 (C++) :");
        int b = s.nextInt();
        System.out.print("Subject 3 (PYTHON) :");
        int c = s.nextInt();

        int total,average;
        String passOfail;

        total = a + b + c;
        average = total / 3;

        if(total <= 40 )
        {
            passOfail = "Fail";
        }
        else
        {
            passOfail = "Pass";
        }

        System.out.println("RESULT");
        System.out.println("Total marks :" + total);
        System.out.println("Percentage :" + average + "%");
        System.out.println("Status :" + passOfail);

    }
    
}

