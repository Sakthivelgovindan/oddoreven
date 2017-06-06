import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
        int a=sc.nextInt();
        System.out.println("enter power");
        int b=sc.nextInt();
        if(b==0)
        {
            System.out.println(1);
        }
        else{
            System.out.println(Math.pow(a,b));
        }
	}
	
}
