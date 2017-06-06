import java.io.*;
import java.util.*;
class Leap {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//int b=sc.nextInt();
		//int c=sc.nextInt();
		if((a%400==0) ||(a%4==0 && a%100!=0))
		{
		    System.out.println(a+"leap year");
		}
		
		else{
		    System.out.println(a+"non leap year");
		}
	}
}
