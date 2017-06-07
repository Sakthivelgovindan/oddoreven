import java.io.*;
import java.util.*;
public class RevInt{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=0,b=0;
        while(a!=0)
        {
            temp=a/10;
            b=a%10;
            a=temp;
            System.out.print(b);
        }
    }
}
