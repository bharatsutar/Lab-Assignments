package lab1ForJavaCoveredUntilNow;

import java.util.*;

public class Alphabets {
	public static void fun(int b, String[] c) {

		if (b % 2 == 0) {

			for (int i = 0; i < b / 2; i++) {

				c[i] = c[i].toUpperCase();
			}
			for (int i = b / 2; i < b; i++) {

				c[i] = c[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < b / 2 + 1; i++) {
				c[i] = c[i].toUpperCase();
			}
			for (int i = b / 2 + 1; i < b; i++) {
				c[i] = c[i].toLowerCase();
			}
		}
		for (int j = 0; j < b; j++)
			System.out.println(c[j]);

	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
//			int num = sc.nextInt();
			System.out.println("Enter  string:");
			
			String str = sc.nextLine();
			System.out.println("String is :");
			//String[] c = new String[100];
			StringTokenizer st = new StringTokenizer(str, " ");
			
			String[] c = new String[st.countTokens()];
			int i = 0;
			while (st.hasMoreTokens() && i < c.length) {
				c[i] = st.nextToken();
				i++;
			}
			Arrays.sort(c);
			fun( c.length,c);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
