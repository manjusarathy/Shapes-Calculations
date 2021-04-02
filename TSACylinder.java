import java.util.*;
class TSACylinder 
{
   public static void main(String args[]) 
   {   
     		Scanner s= new Scanner(System.in);
         	System.out.print("Enter the radius:");
      		double r=s.nextDouble();
      		System.out.print("Enter the height:");
      		double h=s.nextDouble();
      		double  tsa=((2*22*r)/7)*(r+h);
      		System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
     }
}