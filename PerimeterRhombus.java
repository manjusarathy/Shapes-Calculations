import java.util.Scanner;
class PerimeterRhombus
{
   public static void main(String args[]) 
    {   
      	 Scanner s= new Scanner(System.in);
         System.out.print("Enter the side of the Rhombus:");
         double a= s.nextDouble();
         double  perimeter=4*a;
         System.out.println("perimeter of Rhombus is: " + perimeter);      
   }
}
