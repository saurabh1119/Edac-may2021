import java.util.*;

class pattern5{

public static void main(String [] arg)
{
	for( char i = 'A'; i<='E' ;i++ ) // row
	{
		for(char j ='A'; j <=i; j++ ) // column
		{	
			System.out.print(i+" ");
		
		}
		    System.out.print("\n");
	}

}

}