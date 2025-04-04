
import java.util.Scanner;
public class accountm {
	
	String accountholder;
	String accountnumber;
	int balance;
	
	public void deposit(double amount){
		if (amount>0)
			{balance+=amount;
		System.out.println("deposit: "+amount);}
		else
			{System.out.println("invalid amount");}
	}
	public void withdraw(double amount) {
		if (amount>0 & amount<=balance)
		{balance-=amount;
		System.out.println("withdraw: "+amount);}
		 else
			{System.out.println("invalid amount");}
		
	}
	static void display(String accountholder,String accountnumber,int balance) {
		System.out.println(" information below");
		System.out.println("name: "+accountholder);
		System.out.println("accountnumber: "+accountnumber);
		System.out.println("balance: "+balance);
		
	}
	 double remaining(double p,double q) {
		double s=p-q;
		return s;
	}
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner a=new Scanner(System.in);
       System.out.print(" enter accountholder:");
       String accountholder=a.nextLine();
       System.out.print(" enter accountnumber:");
       String accountnumber=a.nextLine();
       System.out.print(" enter balance:");
       int balance =a.nextInt();
       display(accountholder,accountnumber,balance);
       accountm b=new accountm();
   
       b.deposit(2000);
       b.withdraw(500);
       double result=b.remaining(4500,500);
       System.out.println("available balance:"+result);
       
	}

}


	
