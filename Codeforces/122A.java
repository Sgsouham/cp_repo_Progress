//122A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
        int[] l = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        int c=0;
        for (int i = 0; i < l.length; i++) {
            if (n % l[i] == 0) {
		    System.out.println("YES");break;
            }else
            {
                c++;
            }
		    
        }
        if(c==l.length)
        System.out.println("NO");
		   
	}
	
}