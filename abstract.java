abstract class Shape {
	abstract void draw();
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a circle");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a rectangle");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a square");
	}
}
public class AbstractDemo{
	public static void main(String[]args) {
		Shape s1=new Circle();
		Shape s2=new Rectangle();
		Shape s3=new Square();
		s1.draw();
		s2.draw();
	    s3.draw();
		
	}
}

