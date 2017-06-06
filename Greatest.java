import java.io.*;
import java.util.*;
class Greatest {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
		    System.out.println("greatest value"+a);
		}
		else if(b>a && b>c)
		{
		    System.out.println("greatest value"+b);
		}
		else{
		    System.out.println("Greatest value"+c);
		}
	}
}
