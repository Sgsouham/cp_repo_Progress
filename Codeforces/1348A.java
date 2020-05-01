 //1348A
import java.util.*;
 
public class Main 
{
 
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- >0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int j=0;j<n;j++)
		    a[j]=(int)Math.pow(2,j+1);
        int set1[] = new int[(1+a.length)/2];
        int set2[] = new int[(1+a.length)/2];
        
        divideInEqualSums (a, set1, set2);
		}
		
    }
 
    private static void divideInEqualSums(int[] arr, int[] set1, int[] set2) 
    {
        int setSize = set1.length;
        Arrays.sort(arr);
        
        int pos1=0;
        int pos2=0;
        
        int i=arr.length-1;
        
        int sum1 = 0;
        int sum2 = 0;
        while (pos1 < setSize && pos2 < setSize)
        {
            if (sum1 < sum2)
            {
                set1[pos1] = arr[i];
                pos1++;
                sum1 += arr[i];
            }
            else
            {
                set2[pos2] = arr[i];
                pos2++;
                sum2 += arr[i];
            }
            i--;
        }
        
        while (i>=0)
        {
            if (pos1 < setSize)
                set1[pos1++] = arr[i];
            else
                set2[pos2++] = arr[i];
            i--;
        }
        printArrayWithSum(set1,set2);
        
    }
    
    static void printArrayWithSum (int a[], int b[])
    {
        int sum1 = 0;
        int sum2=0;
        for (int i=0; i<a.length; i++)
        {
            sum1 += a[i];
            sum2 += b[i];
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}