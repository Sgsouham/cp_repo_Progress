import java.util.*;
public class Kick_1
{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int j=1;j<=t;j++)
{
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int c=0;
    for(int i=1;i<n-1;i++)
    {
        if(a[i]>a[i-1] && a[i]>a[i+1])
        c++;
    }
    System.out.printf("Case #%d: %d \n",j,c);
    
    
}
	}
}
