import java.io.*;
import java.util.*;
class Reverse {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    char[] b=a.toCharArray();
	   // System.out.println(a.toCharArray());
	    for(int i=b.length-1;i>=0;i--)
	    {
	        System.out.println(b[i]);
	    }
	}
}
