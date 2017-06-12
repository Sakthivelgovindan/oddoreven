import java.io.*;
import java.util.*;
public class CoinsDefault {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=0,e=0;
		int c[]=new int[a];
		for(int i=0;i<a;i++)
		{
			c[i]=sc.nextInt();
		}
		int j=0;
		while(b!=0)
		{
			d=b/c[j];
			e=b%c[j];
			System.out.println(c[j]+"rupee coins"+d );
			b=e;
			j++;
		}
	}

}
