public class Main
{
	public static void main(String[] args) {
	   int n=5;
	   for(int i=1;i<=n;i++){
	       for(int j=1;j<=n-i;j++){ //always (n-current_row) for space
	           System.out.print(" ");
	       }
	       for(int k=1;k<=i;k++){  // ex 1st_row 4_space 1_star
	            System.out.print("*"); // ex 2st_row 3_space 2_star
	       }  // same has current row for star this loop runs i times
	       System.out.println();
	   }
	}
}
