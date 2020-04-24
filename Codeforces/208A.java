//208A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.nextLine();
		String str[]= s.split("(WUB)+");
		for(int i=0;i<str.length;i++)
		{
		    sb.append(str[i]+" ");
		    
		}
		System.out.println(sb.toString().trim());
	}
}