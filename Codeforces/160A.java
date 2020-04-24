//160A
import java.util.*;
public class Solution
{
public static void main (String[] args) 
{
 Scanner sc = new Scanner(System.in);
 int n= sc.nextInt();
int sum=0;
int a[]= new int[n];
 for(int i=0;i<n;i++)
 {
     a[i]= sc.nextInt();
     sum = sum+a[i];
 }
 Arrays.sort(a);
 int ans=0;
 int j=0;
 for(int i=n-1;i>=0;i--)
 {
     ans=ans+a[i];
     sum=sum-a[i];
     j++;
     if(ans>sum)
     break;
 }
 System.out.println(j);
}
}