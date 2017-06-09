import java.io.*;
import java.util.*;
class target {
	public static void main (String[] args) {
	     Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] x=new int[b];
        for(int y=0;y<b;y++)
        {
            x[y]=sc.nextInt();
            //System.out.println(x[y]);
        }
        
        for(int p=0;p<b;p++)
        {
            for(int q=p+1;q<b;q++)
            {
                int w=x[p]+x[q];
                if(w==9)
                {
                   System.out.println(x[p]);
                   System.out.println(x[q]);
                   break;
                }
                
            }
        }
	}
}
