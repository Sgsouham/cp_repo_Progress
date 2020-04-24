//131A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		   int c=0;int n=0;
    Scanner s= new Scanner (System.in);
    String a =s.next();
        for (int i = 0; i < a.length(); i++)
        {        if (a.charAt(i)==Character.toUpperCase(a.charAt(i)))
                            c++;
        else if (a.charAt(0)==Character.toLowerCase(a.charAt(0)))
            
        { n++;
            for (int j = 1; j < a.length(); j++) {
                if (a.charAt(i)==Character.toLowerCase(a.charAt(i)))
           n++;  }
               
        }
        }if (c==a.length())
            System.out.println(a.toLowerCase());
        else if (n==a.length())
            System.out.println(Character.toUpperCase(a.charAt(0))+a.substring(1).toLowerCase());
else
            System.out.println(a);
	}
}