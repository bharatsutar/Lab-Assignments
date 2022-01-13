package lab1ForJavaCoveredUntilNow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class CalculateDurationInDate {
	
	void acceptDate() throws ParseException {
		LocalDate date = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date");
		String localDate = sc.nextLine();
		new SimpleDateFormat("dd-MM-yyyy").parse(localDate); 
		System.out.println("Currant date : "+date);
		System.out.println("Local date: "+localDate);
		
	
		
		
	}

	public static void main(String[] args) throws ParseException {
		
		CalculateDurationInDate c = new CalculateDurationInDate();
		c.acceptDate();
		

	}

}
