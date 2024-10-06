package MyPack1;
import java.util.Scanner;

public class NegativeReplace 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		int i,n=0;
		a=new int[5];
		
		
		System.out.println("Enter Value for array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
				{
				a[i]=0;
				n++;
				}	
		}
		System.out.println("Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);	
		}	System.out.println("Total Replacement="+n);
	}
		
}
