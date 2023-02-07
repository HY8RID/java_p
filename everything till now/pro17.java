import java.util.Scanner;
public class pro17 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = s.nextInt();
        int z;
       
        System.out.println("TABLE");

        for(int i = 1;i<=10;i++){
            z = a * i;
            System.out.println(a + " x " + i + " = " + z);
        }
    }
    
}