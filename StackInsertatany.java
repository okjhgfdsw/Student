/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Stack;

public class Main
{
	public static void main(String[] args) {

	    Stack<Integer> q=new Stack<>();
	    q.push(1);
	      q.push(1);
	       q.push(1);
	        q.push(1);
	         q.push(1);
	     System.out.println(q);
	     Stack<Integer> d=new Stack<>();
	     int index=5;
	     int n=7;
	    while(q.size()>index){
	        d.push(q.pop());
	    }q.push(n);
	    while(d.size()>0){
	        q.push(d.pop());
	    }
	     System.out.println(q);
	     
	}
}
