import java.util.*;
class Odd
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int n=a.length();
        for(int i=0;i<n;i++)
        {
            int k=Integer.valueOf(a.charAt(i))-'0';
            if(k%2!=0)
            {
                System.out.print(k+" ");
            }
        }
    }    
        
}







