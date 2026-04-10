import java.util.Scanner;

/*
write a program that takes the x - u coordinates of a point in the cartesian nplane and prints a message telling either an axis on which the point lies or the quadrant in whith it is found
*/

class Index
{
	public static void main(String args[])
	{
		int x = 0, y = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of x and y: ");
		x = input.nextInt();
		y = input.nextInt();

		// char axisLying;
		// char quadrant;

		if (x == 0 & y == 0) 
		{
			System.out.println("(" + x + ", " + y + ")" + " lies on origin - both x and y axis");
		} 
		else if (x == 0) 
		{
			System.out.println("(" + x + ", " + y + ")" + " lies on y axis");
		}
		else if (y == 0) 
		{
			System.out.println("(" + x + ", " + y + ")" + " lies on x axis");
		}
		else if (x > 0) 
		{
			if (y > 0)
			{
				System.out.println("(" + x + ", " + y + ")" + " lies in 1st Quadrant");
			}
			else 
			{
				System.out.println("(" + x + ", " + y + ")" + " lies in 4th Quadrant");
			}
		}
		else if (x < 0) 
		{
			if (y > 0)
			{
				System.out.println("(" + x + ", " + y + ")" + " lies in 2nd Quadrant");
			}
			else 
			{
				System.out.println("(" + x + ", " + y + ")" + " lies in 3rd Quadrant");
			}
		}

		input.close();
	}
}
