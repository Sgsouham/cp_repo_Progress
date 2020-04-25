//490A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		a[i]= sc.nextInt();
		Map<Integer,Integer>mp = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
		    mp.put(a[i], mp.getOrDefault(a[i],0)+1);
		}
		for(int x : mp.values())
		{
		if(x<min)
		min=x;
		}
		if(mp.size()==3){
		System.out.println(min);
		
		ArrayList<Integer> index1=new ArrayList<>();
        ArrayList<Integer> index2=new ArrayList<>();
        ArrayList<Integer> index3=new ArrayList<>();
 
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
                index1.add(i+1);
            else if(a[i]==2)
                index2.add(i+1);
            else
                index3.add(i+1);
        }
        for(int i=0;i<min;i++)
        {
            System.out.println(index1.get(i)+" "+index2.get(i)+" "+index3.get(i));
        }}
        else
		System.out.println(0);
	}
}
