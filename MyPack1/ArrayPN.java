package MyPack1;
import java.util.Scanner;
public class ArrayPN 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[],b[];
		int i;
		a=new int[10];
		b=new int[10];
		
		System.out.println("Enter Value for array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);		
		}
		
		int j=0;
		for(i=0;i<a.length;i++)		
		{
				if(a[i]>0)
				{
					b[j]=a[i];
					j++;
				}
		}
		System.out.println("Positive Array Elements");
		
		for(i=0;i<j;i++)	
		{
			System.out.println("b["+i+"]="+b[i]);
		}
			
		System.out.println("Total ="+j);
	}
}
