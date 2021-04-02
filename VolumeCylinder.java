import java.util.Scanner;
class VolumeCylinder 
{
   public static void main(String args[]) 
    {   
	   	Scanner s= new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r=s.nextDouble();
        System.out.print("Enter the height:");
        double h=s.nextDouble();
        double  volume=((22*r*r*h)/7);
        System.out.println("volume of Cylinder is: " +volume);
    }
}