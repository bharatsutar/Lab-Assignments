package lab1ForJavaCoveredUntilNow;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfAllIntegerUseStringTokenizerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");  
		int sum=0;
		 while (st.hasMoreTokens()) {  
			 String s = st.nextToken();
			 sum += Integer.parseInt(s);  
			 System.out.println(s);  
	           
	     } 
		 System.out.println("Sum of all integer is : "+sum);
	}

}
