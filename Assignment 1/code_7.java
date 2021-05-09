import java.util.Scanner;

class code_7
{
	public static void main(String arg [])
	{ int sum = 1;
	   int i, Table= 0;
 	System.out.print("Table");
	Scanner tbl = new Scanner(System.in);
	System.out.print("Enter the Table = ");
	int a = tbl.nextInt();

	for(i = 1; i<=10;++i)
		{   Table = i * a; 
    	    	    System.out.println(Table);
		}
	}

}