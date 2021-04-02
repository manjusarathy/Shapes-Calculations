import java.io.*;
import java.util.*;
import java.math.*;
public class AreaIsosceles
{
	public static void main(String args[])
	{
		double a,b,area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a and b : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		area = (b/4)*Math.sqrt((4*a*a)-(b*b));
		System.out.println("Area of isosceles triangle : "+area);
	}
}