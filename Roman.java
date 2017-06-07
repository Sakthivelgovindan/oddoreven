import java.io.*;
import java.util.*;
public class Roman{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        char[] b=a.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            switch(b[i])
         {
            case 'M':
                count=count+1000;
                
                break;
            case 'D':
                 count=count+500;
                break;
            case 'C':
                count=count+100;
                break;
            case 'L':
                count=count+50;
                break;
            case 'X':
                 count=count+10;
                 break;
            case 'V':
                 count=count+5;
                 break;
            case 'I':
                 count=count+1;
                break;
        }
        
       
        }
         System.out.println(count);
    }
}
