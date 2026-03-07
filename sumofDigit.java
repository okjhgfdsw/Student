*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int originalnumber=num;
		while(num !=0){
		    int lastdigit=num % 10;
		    sum+=lastdigit;
		    num/=10;
		}
		System.out.println("the sum of Digit"+originalnumber+"="+sum);
	}
}
