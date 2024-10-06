package MyPack1;
import java.util.Scanner;

public class SumDigitA 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[],b[];
		int i,n,s;
		a=new int[5];
		b=new int[5];
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
		//b
		
		for(i=0;i<a.length;i++)
		{
			n=a[i];
			s=0;
			while(n>0)
			{
				s=s+n%10;
				n=n/10;
			}
			b[i]=s;
		}
		System.out.println("Sum Array Elements");
		for(i=0;i<b.length;i++)
		{
			System.out.println("b["+i+"]="+b[i]);	
		}
}
}

