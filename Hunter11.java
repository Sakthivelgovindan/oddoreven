import java.io.*;
import java.util.*;
import java.lang.*;
public class Hunter11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char[] c=a.toCharArray();
		
		int b=a.length();
		
		char[] q=new char[b];
		int y=0;
		
		for(int i=b;i>0;i--)
		{
			
			q[y]=c[i-1];
	
			System.out.print(q[y]);
			y++;
		}
		
	}
}
