//791A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		do{
		    a=a*3;
		    b=b*2;
		    c++;
		}while(a<=b);
		System.out.println(c);
	}
}
