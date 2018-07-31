import java.util.*;
class Com
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
               c++;              
        }
        if(c==2)
        System.out.print("no");
        else
        System.out.print("yes");
}
}






