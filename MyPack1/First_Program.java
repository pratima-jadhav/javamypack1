package MyPack1;
import java.util.Scanner;
public class First_Program 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		int i,o=0,e=0;
		a=new int[5];
		System.out.println("Enter Value for array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			e=e+a[i];
			else
			o=o+a[i];
			
		}
		System.out.println("Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
			
		}
		System.out.println("Sum of Even ="+e);
		System.out.println("Sum of Odd ="+o);
	}
}
