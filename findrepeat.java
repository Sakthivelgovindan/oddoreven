import java.io.*;
import java.util.*;
class findrepeat{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int[] a=new int[b];
		for(int i=0;i<b;i++)
		{
		    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int j=0;j<b;j=j+2)
		{
		    if(a[j]==a[j+1])
		    {
		        continue;
		    }
		    else{
		        System.out.println(a[j]);
		        break;
		    }
		}
	}
}
