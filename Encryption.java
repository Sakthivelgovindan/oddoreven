import java.io.*;
import java.util.*;
public class Encryption {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		int z=b.length();
		for(int i=0;i<a.length();i++)
		{
			char e=c[i];
			int x=(int)e+10;
			char f=(char)x;
			System.out.print(f);
		}
		System.out.print(" ");
		for(int j=0;j<b.length();j++)
		{
			char w=d[j];
			int y=(int)w;
			if((j==0) || (j==z-1))
			{
				System.out.print(d[j]);
			}
			
			
			
			else if(y>112)
			{
				int t=y-16;
				char w1=(char)t;
				System.out.print(w1);
			}
			
			
			else{
				char g=d[j];
				int y1=(int)g+10;
				char h=(char)y1;
				System.out.print(h);
			}
		}
		
	}

}
