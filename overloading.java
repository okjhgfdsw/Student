import java.util.Scanner;
public class overloading {
         static int area(int s) {
        	return s*s;
        }
         double area(double r) {
        	return (22*r*r)/7;
        }
         static double area(double h,double b) {
        	return (b*h)/2;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner a=new Scanner(System.in);
          System.out.println("enter side");
          int s=a.nextInt();
          System.out.println("enter radius");
          double r=a.nextDouble();
          System.out.println("enter height");
          double h=a.nextDouble();
          System.out.println("enter breath");
          double b=a.nextDouble();
          System.out.println(area(s));
          System.out.println(area(h,b));
          overloading x=new overloading();
          System.out.println(x.area(r));
         
          
	}

}
