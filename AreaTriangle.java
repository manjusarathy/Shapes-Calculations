import java.util.*;
public class AreaTriangle 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
      System.out.print("Enter the width of the Triangle:");
      double b= s.nextDouble();
      System.out.print("Enter the height of the Triangle:");
      double h= s.nextDouble();
      double area=(b*h)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}