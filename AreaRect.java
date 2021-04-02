import java.io.*;
import java.util.*;
public class AreaRect
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double l,b,area;
		System.out.print("Enter length and breadth : ");
		l = sc.nextDouble();
		b = sc.nextDouble();
		area = l*b;
		System.out.println("Area of rectangle : "+area);
	}
}