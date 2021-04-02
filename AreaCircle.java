import java.util.*;
public class AreaCircle 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
      System.out.print("Enter the radius:");
      double r= s.nextDouble();
      double  area=(22*r*r)/7 ;
      System.out.println("Area of Circle is: " + area);      
   }
}