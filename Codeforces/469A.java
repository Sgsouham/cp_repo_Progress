//469A
import java.util.*;
public class Solution
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int flag=0;
		List<Integer>a = new ArrayList<>();
		List<Integer>b  = new ArrayList<>();
		for(int i=0;i<p;i++)
		a.add(sc.nextInt());
		int q = sc.nextInt();
		for(int i=0;i<q;i++)
		b.add(sc.nextInt());
		Set<Integer>c  = new HashSet<Integer>();
		for(int i :a)
		c.add(i);
		for(int i : b)
		c.add(i);
		if(c.size()==n)
		System.out.println("I become the guy.");
		else
		System.out.println("Oh, my keyboard!");
		
		
	}
}