//978B
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = Integer.parseInt(sc.nextLine());
	    String s= sc.nextLine();
	    int c=0;
	    for(int i=0;i<n-2;i++)
	    {
	        if(s.charAt(i)=='x' && s.charAt(i+1)=='x' && s.charAt(i+2)=='x')
	        c++;
	    }
		System.out.println(c);
	}
}