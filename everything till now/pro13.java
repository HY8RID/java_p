import java.util.Scanner;
class pro13{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = s.nextInt();

        if(a % 2==0 || a==0)
        {
            System.out.println(a + " is even number");
        }
		else
		{
			System.out.println(a + " is odd number");
		}	
    }
}