import java.util.Scanner;
class VolumePrism 
{
   public static void main(String args[]) 
    {   
       
	   Scanner s= new Scanner(System.in);      
       System.out.print("Enter the area of base:");
       double base=s.nextDouble();
       System.out.print("Enter the height:");
       double height=s.nextDouble();
       double  area=base*height ;
       System.out.println("Volume Of Prism is: " + area);      
   }
}