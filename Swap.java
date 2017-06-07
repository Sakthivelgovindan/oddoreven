import java.io.*;
import java.util.*;
public class Swap{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        char[] c=b.toCharArray();
        int a=b.length();
        char temp;
        //System.out.println(a);
        for(int i=0;i<a;i=i+2)
        {
            temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
        }
        System.out.println(c);
    }
}
