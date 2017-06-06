import java.io.*;
import java.util.*;
class SumN {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int j=0;
		int N=sc.nextInt();
		//int b=sc.nextInt();
		//int c=sc.nextInt();
		for(int i=1;i<N;i++)
		{
		  j=j+i;
		}
		System.out.println(j);
	}
}
