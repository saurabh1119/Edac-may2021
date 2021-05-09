import java.util.*;

class code_14
{	
  public static void main(String [] arg)
 { 
	for( int i = 1;i<=9;i++ )     //  BOX 1
	{   if(i%2!=0)
		{
		   for(int j=1;j<=11;j++)
	        {  	if(j%2!=0)
					System.out.print("*");
				else
					System.out.print(" ");
				
		    }
			System.out.print(" ");
			for(int j=13;j<=40;j++)
			 System.out.print("=");
	     
		 System.out.println("");
	   }
	   else
	   {
		 for(int j=1;j<=10;j++)
	        {  	if(j%2==0)
					System.out.print("*");
				else
					System.out.print(" "); 
			} 
		 System.out.print("  ");
		 for(int j=13;j<=40;j++)
			 System.out.print("=");
	     
		 System.out.println("");
		 
	   }
	     
	}
	for(int j=10;j<=15;j++)
	{	for(int m = 1; m<=40;m++)
			System.out.print("=");
	     
	  System.out.println("");
	}
 }
}
