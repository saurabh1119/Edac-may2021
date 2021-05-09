import java.util.*;

class pattern6{

public static void main(String [] arg)
{
	for( int i = 5; i>=1 ;i-- ) // row
	{
		for(int j=1 ; j<i; ++j ) // column
		{	
			System.out.print("  ");
		
		}
		for(int k=5 ; k>=i; k-- ) // column
		{	
			System.out.print(" *");
		
		}
		System.out.print("\n");
	}

}


}