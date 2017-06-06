import java.io.*;
import java.util.*;
class Digit {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int j=0,temp=0;
		int a=sc.nextInt();
		int count=0;
	    while(a!=0)
	    {
	       temp=a/10;
	       j=a%10;
	        a=temp;
	        count=count+1;
	         
	    }
	   
	System.out.println(count);	
	}
	
}
