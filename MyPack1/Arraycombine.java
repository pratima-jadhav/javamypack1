package MyPack1;

import java.util.Scanner;
public class Arraycombine 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[],b[],c[];
		int i;
		a=new int[5];
		b=new int[5];
		c=new int[10];
		//a
		System.out.println("Enter Value for 1st array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("1st Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
			
		}
		//b
		System.out.println("Enter Value for 2nd array");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("2nd Array Elements");
		for(i=0;i<b.length;i++)
		{
			System.out.println("b["+i+"]="+b[i]);
	
		}
		//c
		System.out.println("New Array Elements");
		int j=0;
		for(i=0;i<c.length;i++)	
		{
			System.out.println("c["+j+"]="+a[i]);
			j++;
			System.out.println("c["+j+"]="+b[i]);
			j++;
		}
	}
}
