//69A
import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[][]=new int[n][3];
	    for(int i=0;i<n;i++)
	    for(int j=0;j<3;j++)
	    {
	       a[i][j]=sc.nextInt();
	    }
		int sx=0;
		int sy=0;
		int sz=0;
		for(int i=0;i<n;i++)
		{
		    sx=sx+a[i][0];
		    sy=sy+a[i][1];
		    sz=sz+a[i][2];
		}
		if(sx==0 && sy==0 && sz==0)
		System.out.println("YES");
		else
		System.out.println("NO");
    }
}