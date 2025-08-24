import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
	    Stack<Integer> q=new Stack<>();
	    	System.out.println(q.isEmpty());
	    q.push(1);
	    q.push(2);
	    q.push(3);
	    q.push(4);
	    System.out.println(q.peek());
	    q.pop();
	    System.out.println("Size is-"+q.size());
		System.out.println(q);
		while(q.size()>1){
		    q.pop();
		} System.out.println(q.peek());
	}
}
