import java.io.*;
import java.util.*;
public class AreaSq
{
	public static void main(String args[])
	{
		double a,area;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A : ");
		a = s.nextDouble();
		area = a*a;
		System.out.println("Area : "+area);
	}
}