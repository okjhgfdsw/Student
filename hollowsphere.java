public class Main
{
	public static void main(String[] args) {
	   int n=4;
	   for(int i=1;i<=n;i++){
	      
	       for(int k=1;k<=n;k++){  
	           if(i==1 || k==1 || i==n || k==n)  System.out.print("*"); // here randomly hai henece you had option of * and space according to condition
	            else   // key point is 1st and last has no sapce and middle has start only at boundery
	            System.out.print(" "); 
	       } 
	       System.out.println();
	   }
	}
}
