import java.io.*;
import java.util.*;
public class Snake {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			if(i==0 || i==a-1)
			{
				for(int j=0;j<a;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else{
				for(int k=0;k<a;k++)
				{
					if(k==0 || k==a-1)
					{
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.println( );
			}
		}
	}

}
