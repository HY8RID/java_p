public class pro4 {
    public static void main(String args[]){
        int a = 10;
        int b = 3;
        int z;

        System.out.println("BEFORE");
		System.out.println("a =" + a);
		System.out.println("b =" + b);

        z = a;
        a = b;
        b = z;

        System.out.println("After");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
    }
}
