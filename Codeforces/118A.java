//118A String task
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    String s= sc.nextLine();
		    s=s.toLowerCase();
		    String w="";
		    int x=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y')
		        continue;
		        else
		        w=w+"."+s.charAt(i);
		    }
		    System.out.println(w);
	}
}