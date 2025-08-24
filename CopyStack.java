import java.util.Stack;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    Stack<Integer> q=new Stack<>();
	    int n;
	    System.out.println("enter no. of element:");
	    n=s.nextInt();
	     System.out.println("enter elements:");
	     int x;
	     for(int i=1;i<=n;i++){
	         x=s.nextInt();
	         q.push(x);
	     }
	     System.out.println(q);
	     System.out.println("Reverse order of stack");
	     Stack<Integer> d=new Stack<>();
	     int i=1;
	     while(i<=n){
	         d.push(q.pop());
	         i++;
	     }
	     System.out.println(d);
	     System.out.println("Copy of stack");
	     Stack<Integer> t=new Stack<>();
	     i=1;
	     if(n>0){  do{
	         t.push(d.pop());
	          i++;
	     }while(i<=n);
	     }
	     System.out.println(t);
	}
}
