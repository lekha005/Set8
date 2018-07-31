import java.util.*;
class In
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int l=in.nextInt();
        int r=in.nextInt();
        int c=0;
        for(int i=l+1;i<r;i++)
        {
           if(i==n)
           c++;
        }
        if(c!=0)
            System.out.print("yes");
            else
            System.out.print("no");
}
}






