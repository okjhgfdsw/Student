public class Main
{
	public static void main(String[] args) {
	   int n=7;
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==1|| i==n || j==1 || j==n) { System.out.print("1 ");  }
	            else if(i==2|| i==n-1 || j==2 || j==n-1) {System.out.print("2 "); }
	             else if(i==3|| i==n-2 || j==3 || j==n-2) {System.out.print("3 "); }
	            else
	            System.out.print("4 ");
	            
	        }
	        
	         System.out.println();
	    }
		
	}
}
// scalable way of code
public class Main {
    public static void main(String[] args) {
        int n = 7; // You can change this to any number (e.g., 11 or 15)

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= n; j++) {
                
                /* * The logic: Calculate the distance from the current (i, j) 
                 * to all four edges (top, bottom, left, right).
                 * The smallest distance determines which "layer" we are in.
                 */
                
                int top = i;
                int bottom = n - i + 1;
                int left = j;
                int right = n - j + 1;

                // Find the minimum of all four distances
                int layerValue = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(layerValue + " ");
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}
// calculation for 4th row 
// Step,Column (j),Top (i),Bottom (7−4+1),Left (j),Right (7−j+1),"Calculation: min(4,4,j,Right)",Result
// 1,j=1,4,4,1,7,"min(4,4,1,7)",1
// 2,j=2,4,4,2,6,"min(4,4,2,6)",2
// 3,j=3,4,4,3,5,"min(4,4,3,5)",3
// 4,j=4,4,4,4,4,"min(4,4,4,4)",4
// 5,j=5,4,4,5,3,"min(4,4,5,3)",3
// 6,j=6,4,4,6,2,"min(4,4,6,2)",2
// 7,j=7,4,4,7,1,"min(4,4,7,1)",1
