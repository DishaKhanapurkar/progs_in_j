import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class prog7 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(buildLargest(getDuplicateRemovedNumbers(input)));
		sc.close();
	}
	public static ArrayList<Integer>
	getDuplicateRemovedNumbers(String input){
		ArrayList<Integer> output=new ArrayList<>();
		for(String s: input.split(""))
			if(isDigit(s)) {
				int digit=Integer.parseInt(s);
				if(!output.contains(digit))
					output.add(digit);
				}
		Collections.sort(output,new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0,Integer arg1) {
				return arg1-arg0;
			}});
		return output;
			}
			
		}
	}
}
