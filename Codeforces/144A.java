//114A
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int min=0;int max=0;
        for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
        if (arr[min] >= arr[i]) {
                min = i;
            }
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        if(min<max)
        System.out.println(max+n-2-min);
        else
        System.out.println(max+n-1-min);
        
    }
}