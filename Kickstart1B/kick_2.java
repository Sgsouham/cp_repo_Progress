import java.util.*;
public class kick_2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1;x<=t;x++)
        {
            long n = sc.nextLong();
            long d = sc.nextLong();
            List<Long>a = new ArrayList<Long>();
            long ans=d;
            for(int i=0;i<n;i++)
            a.add(sc.nextLong());
            for(int i=(int)n-1;i>=0;i--)
            ans=ans/a.get((int)i)*a.get((int)i);
            System.out.printf("Case #%d: %d\n",x,ans);
        }
}
}