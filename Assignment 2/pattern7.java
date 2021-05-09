import java.util.*;

class pattern7{

public static void main(String [] arg)
{ 
	for(int i=1; i<=9; ++i ) 
	{
		for(int j=4; j>=i;--j ) 
		{	
			System.out.print("*");
		}
		System.out.print("\n");
	
		for( int k=1; k<=4; ++k ) 
		{
			for(int l=9;l>k;--l ) 
			{	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	

}
}