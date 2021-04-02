import java.io.*;
import java.util.*;
public class AreaParallelogram
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		double d1,d2,area;
		System.out.print("Enter d1 and d2 : ");
		d1 = s.nextDouble();
		d2 = s.nextDouble();
		area = d1*d2;
		System.out.println("Area : "+area);
	}
}