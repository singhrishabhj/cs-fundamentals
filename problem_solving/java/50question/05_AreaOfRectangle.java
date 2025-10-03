import java.util.Scanner;

public class AreaOfRectangle{
  public static void main(String []args)
  {
      Scanner scn = new Scanner(System.in);
  
      //Taking the length of rectangle
      System.out.println("Enter the length of the rectangle ");
      float length = scn.nextFloat();
  
      // //Taking the breadth of rectangle
      System.out.println("Enter the breadth of the rectangle "); 
      float breadth = scn.nextFloat();
  
      //The area of rectangle
      System.out.println(" The Area of Rectangle : " + (length * breadth));
  }
}
