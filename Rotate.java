import java.io.*;
import java.util.Scanner;
public class Rotate {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int b=sc.nextInt();
		
		for(int i=b;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		for(int j=0;j<b;j++)
		{
			System.out.print(a[j]);
		}
	
		
	}  
	
	}
