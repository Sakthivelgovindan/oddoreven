import java.io.*;
import java.util.*;
class RemoveDuplicate {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		//char[] x=a.toCharArray();
		int b=a.length();
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		for(int c=0;c<b;c++)
		{
		    hs.add(a.charAt(c));
		}
		for(char l:hs)
		{
		    System.out.print(l);
		}
	}
}
