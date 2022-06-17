import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class minprice {
	//2034
	//2
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int ticket;
		int zero=0,turns;;
		System.out.println("Enter the price");
		ticket=sc.nextInt();
		System.out.println("Enter the turns");
		turns=sc.nextInt();
		
		int n=ticket;
		ArrayList<Integer>al=new ArrayList<Integer>();
		while(n!=0) {
			int rem=n%10;
			al.add(rem);
			n=n/10;
			
		}
		Collections.sort(al);
		if(al.contains(zero)) {
			for(int i=1;i<(al.size()-turns);i++) {
				System.out.print(al.get(i));
			}
		}
			else {
				for(int i=0;i<(al.size()-turns);i++) {
					System.out.print(al.get(i));
				}
			}
		
	}

		
		
		

}
