//580A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		int max = Integer.MIN_VALUE;
		int c=1;
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		if(a.length==1)
		max=a.length;
		else
		for(int i=0;i<n-1;i++)
		{
		    if(a[i]<=a[i+1])
		    c++;
		    else c=1;
		    max=Math.max(c,max);
		}
		System.out.println(max);
	}
}