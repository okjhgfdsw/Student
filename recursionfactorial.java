public class Main
{	public static int factorial(int n){
	    if(n<=1){
	        return 1;
	    }
	    return n*factorial(n-1);
	}
	public static void main(String[] args) {
    // Main obj=new Main();
    // System.out.println(obj.factorial(4));
    System.out.println(factorial(4)); //if method is static
	}
}
