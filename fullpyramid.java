public class Main
{
	public static void main(String[] args) {
	   int n=5;
	   for(int i=1;i<=n;i++){
	       for(int j=1;j<=n-i;j++){ //always (n-current_row) for space
	           System.out.print(" ");
	       }
	       for(int k=1;k<=i*2-1;k++){  // ex 1st_row 4_space 1_star
	            System.out.print("*"); // ex 2st_row 3_space 3_star
	       }  // odd increment karna tha so i*2-1
	       System.out.println();
	   }
	}
}
