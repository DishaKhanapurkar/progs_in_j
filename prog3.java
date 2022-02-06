import java.io.*;
public class prog3{
	public static void main(String args[]) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input="ghftd:1246";
		String split[]=input.split(":");
		String str=split[0];
		int sum=0;
		
		for(int i=0;i<split[1].length();i++) {
		 int n=Integer.parseInt(String.valueOf(split[1].charAt(i)));
		 sum=sum+(n*n);
		}
		String res="";
		if(sum%2==0) {//rhdt->trhd if sum of squares of number associated in even
			res=str.substring(str.length()-1,str.length())+str.substring(0,str.length()-1);
		}
		else// ghftd->ftdgh  if sum of squares of number associated in odd 
			res=str.substring(2)+str.substring(0,2);
		System.out.println(res);
	}
}