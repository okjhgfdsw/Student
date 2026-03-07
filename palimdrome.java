import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int originalnumber=num;
		int reverse=0;
		boolean ispalindrome=true;
		while(num !=0){
		    int lastdigit=num % 10;
		    reverse=reverse*10 + lastdigit;
		    num/=10;
		    
		}
		
		System.out.println("the sum of Digit"+originalnumber+"="+reverse);
		if(ispalindrome){
		    if(originalnumber == reverse) 	System.out.println("yes it is palindrome");
		    else System.out.println("NO it is palindrome");
		}
	}
}
