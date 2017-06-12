import java.io.*;
import java.util.*;
class Hunter12 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	//	int a=sc.nextInt();
		int[] a1=new int[50];
		int x=sc.nextInt();
		for(int i=0;i<50;i++)
		{
		    a1[i]=sc.nextInt();
		   
		}
		Arrays.sort(a1);
		System.out.print(a1[50-4]);
		System.out.print(a1[x-1]);
		
	}
}
