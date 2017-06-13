import java.util.*;

class Rotates {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int x1=sc.nextInt();
		int[] y=new int[x];
		for(int a=0;a<x;a++)
		{
		    y[a]=sc.nextInt();
		}
		for(int i=x1+1;i<x;i++)
		{
		    System.out.print(y[i]);
		}
		for(int j=0;j<=x1;j++)
		{
		    System.out.print(y[j]);
		}
		
	}
}
