//996A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
        int c[] = {100,20,10,5,1};
        int ans=0;
        for(int i: c)
        {
            ans= ans + n/i;
            n%=i;
        }
        System.out.println(ans);
        
	}
}
