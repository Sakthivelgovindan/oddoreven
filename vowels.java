import java.io.*;
import java.util.*;
class Vowels {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(2);
		try{
		if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u')
		{
	     System.out.println("vowel");
		}
	
		else
		{
		    System.out.println("consonant");
		}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
