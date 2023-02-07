import java.util.Scanner;
public class pro12 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = s.nextInt();
        
        if(a%2==0 && a%5==0)
        {
            System.out.print(a + " is divisible by 2 and 5");
        }

        else if(a%2==0 || a%5==0)
        {
            if(a%2==0)
            {
                System.out.print(a + " is divisible by 2 and not with 5");
            }

            else if(a%5==0)
            {
                System.out.print(a + " is divisible by 5 and not with 2");
            }
        }
        else
        {
            System.out.print(a + " is not divisible by 2 and 5");
        }
    }
}