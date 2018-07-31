import java.util.*;
class Sqr
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int s=n*m;
        int c=0;
        for(int i=1;i<s;i++)
        {
            if(i*i==s)
            c++;
        }
        if(c!=0)
               System.out.print("yes");    
               else
               System.out.print("no");
}
}






