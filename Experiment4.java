//Experiment 4
import java.util.*;
abstract class Shape
{
	double length,breadth,area;
	abstract void computeArea();
}
class Rectangle extends Shape
{
	Rectangle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter length");
		length=s.nextDouble();
		System.out.println("enter breadth");
		breadth=s.nextDouble();
		
	}
	void computeArea()
	{
	  area=length*breadth;
	  System.out.println("area of rectangle="+area);
	}
}
class Triangle extends Shape
{
	Triangle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter base");
		length=s.nextDouble();
		System.out.println("enter height");
		breadth=s.nextDouble();
		
	}
	void computeArea()
	{
		area=0.5*(length*breadth);
		System.out.println("area of triangle="+area);
	}
}
class Experiment4
{
	public static void main(String[] args)
	{
		//Scanner s=new Scanner(System.in);
		
		Rectangle r=new Rectangle();
		r.computeArea();
		Triangle t=new Triangle();
		t.computeArea();
 
	}
}
