import java.util.Scanner;

class code_12
{
  public static void main( String arg[])
  {	float a1 , a2, a3 ;
	float avg;
	Scanner sc = new Scanner(System.in);
	System.out.print(" enter the no 1 = ");
	a1 = sc.nextFloat();
	System.out.print(" enter the no 2  = ");
	a2 = sc.nextFloat();
	System.out.print(" enter the no 3 = ");
	a3 = sc.nextFloat();
        avg = ( a1 + a2 + a3)/3;
        System.out.println(" average = "+ avg);
		
  }
  
}