import java.io.*;
import java.util.*;
class Stringpossible {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int a1=a.length();
	//System.out.print(a1);
        
		char q[]=a.toCharArray();

		int b=sc.nextInt();
    
		for(int i=b-1;i<a1;i++)
		{
		    
		 System.out.print(q[0]);
		 System.out.println(q[i]);
		
		 
		}
	}
}
