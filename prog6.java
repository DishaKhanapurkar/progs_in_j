// get 4 digit otp like number from squaring odd places numbers in given array
import java.util.*;

public class prog6 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String output="";
	String input=sc.nextLine();
	int index=0;
	for(String s:input.split(""))
	{
		if(!(index%2==0)) 
			output+=Math.round(Math.pow(Integer.parseInt(s),2));
		if(output.length()>=4)
			break;
		index++;
		
	}
	System.out.println(output.substring(0,4));

}
}