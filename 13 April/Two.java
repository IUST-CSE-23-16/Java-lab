import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

class Circle 
{
	double m_radius;

	public Circle(double radius) 
	{
		m_radius = radius;
	}
	

	double area()
	{
		return Math.PI * m_radius * m_radius;
	}

	double perimeter()
	{
		return 2 * Math.PI * m_radius;
	}
}

class Rectangle 
{
	double m_length, m_breadth;

	public Rectangle(double length, double breadth) 
	{
		m_length = length;
		m_breadth = breadth;
	}
	

	double area()
	{
		return (m_length * m_breadth);
	}
	
	double perimeter()
	{
		return 2 * (m_length + m_breadth);
	}
}

public class Two 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.err.println("--------- CIRCLE --------- ");
		
		double c_radius; 
		System.err.print("Enter radius: ");
		c_radius = sc.nextDouble();

		Circle myCircle = new Circle(c_radius);
		System.err.println("Area      : " + df.format(myCircle.area()));
		System.err.println("Perimeter : " + df.format(myCircle.perimeter()));
		
		
		
		
		System.err.println("\n--------- RECTANGLE --------- ");
		double r_length, r_breadth;
		System.err.print("Enter length  : ");
		r_length = sc.nextDouble();
		System.err.print("Enter breadth : ");
		r_breadth = sc.nextDouble();
		
		Rectangle myRectangle = new Rectangle(r_length, r_breadth);
		System.err.println("Area      : " + df.format(myRectangle.area()));
		System.err.println("Perimeter : " + df.format(myRectangle.perimeter()));
		
		
		sc.close();
	}
}
