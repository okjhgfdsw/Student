import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int originalnumber=num;
		int n=num;
		int sum=0;
		int count=0;
		boolean isArmstrong=true;
		while(n !=0){
		    n/=10;
		    count++;
		    
		}
		while(num !=0){
		    int lastdigit=num % 10;
		   sum+=Math.pow(lastdigit,count);
		    num/=10;
		}
		
		System.out.println("the sum of Digit"+ originalnumber+"="+sum);
		if(isArmstrong){
		    if(originalnumber == sum) 	System.out.println("yes it is Armstrong");
		    else System.out.println("NOt  Armstrong");
		}
	}
}
