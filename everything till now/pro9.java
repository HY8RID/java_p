public class pro9 {
    public static void main(String args[]) {
		int a=10;
		int b=20;

		System.out.println("BEFORE");
		System.out.println("a =" + a);
		System.out.println("b =" + b);

		a = a ^ b ^ (b=a);       
		
		System.out.println("AFTER");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}
}
