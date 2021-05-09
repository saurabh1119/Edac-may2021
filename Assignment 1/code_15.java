import java.util.*;

class code_15
{	
	public static void main(String [] arg)
	{
	   int a = 10;
	   int b = 30;
	   
	   a = b-a;     
	   b = b-a;          
	   a = a+b;  
	   System.out.print( " a = "+a+" b = "+b);
	}
}