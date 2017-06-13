import java.util.*;
public class prime{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=1;
        for(int i=2;i<a;i++)
        
        {
            if(a/i==0)
            {
                flag=0;
                System.out.print(a+"is not prime");
                break;
            }
            
        }
        if(flag==1)
        
        {
            System.out.print(a+"is prime");
        }
        
        
    }
}
