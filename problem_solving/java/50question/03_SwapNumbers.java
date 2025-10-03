public class SwapNumbers{

  public static void main(String [] args ){

    // initialising the numbers 
    int a = 100;
    int b = 9595;
    int temp;

    System.out.println("The number to be swap is a = "+ a + " and b = " + b);

    //swapping the two numbers 
    temp = a;
    a = b;
    b = temp ;

    System.out.println("The numbers after swapping are a = " + a + " and b = " + b); 
  }
}
