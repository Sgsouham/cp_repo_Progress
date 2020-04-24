//337A
import java.util.*;
public class Solution
{
public static void main (String[] args) 
{
 Scanner sc = new Scanner(System.in);
 int n= sc.nextInt();
 int m = sc.nextInt();
 int diff=0;
 int a[]= new int[m];
 int min = Integer.MAX_VALUE;
 for(int i=0;i<m;i++)
 {
     a[i]= sc.nextInt();
 }
 Arrays.sort(a);
 for(int i=0;i<m;i++)
 {   
     if(n+i<=m)
     {
     diff=Math.abs(a[i]-a[n+i-1]);
     min =Math.min(min,diff);
         
     }
     else 
     break;
}
System.out.println(min);
		
	}
}