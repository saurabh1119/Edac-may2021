import java.util.*;

class pattern17{

public static void main(String [] arg)
{ int count = 1;
	for(int i= 6; i>=1; --i ) 
	{
		for(int j=5; j>=i;--j ) 
		{	
			System.out.print(count+" ");
			count++;
		}
		
		System.out.print("\n");
	}

}
}