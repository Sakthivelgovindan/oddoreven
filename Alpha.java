import java.io.*;
import java.util.*;
class Alpha {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		try{
		if(Character.isLetter(a))
		{
	     System.out.println("alphabet");
		}
	
		else
		{
		    System.out.println("not");
		}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
