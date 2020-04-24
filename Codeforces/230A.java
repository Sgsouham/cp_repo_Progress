//230A
import java.util.Scanner;
public class Solution {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int strength = scan.nextInt();
		int n = scan.nextInt();
		int dragonStrength[] = new int[n];
		int bonusStrength[]= new int[n];
		for(int i=0;i<n;i++) {
			dragonStrength[i]=scan.nextInt();
			bonusStrength[i]=scan.nextInt();
 
		}
		scan.close();
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(dragonStrength[j]>dragonStrength[j+1]) {
					temp=dragonStrength[j];
					dragonStrength[j]=dragonStrength[j+1];
					dragonStrength[j+1]=temp;
					temp=bonusStrength[j];
					bonusStrength[j]=bonusStrength[j+1];
					bonusStrength[j+1]=temp;
				}
			}
		}
		int i;
		for(i=0;i<n;i++) {
			if(strength>dragonStrength[i]) {
				strength+=bonusStrength[i];
			}
			else {
				break;
			}
		}
		if(i==n)
			System.out.println("YES");
		else
			System.out.println("NO");
 
	}
 
}