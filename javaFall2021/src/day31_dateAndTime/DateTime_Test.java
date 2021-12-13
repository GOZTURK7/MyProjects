package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime_Test {

	public static void main(String[] args) {


		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Local Date: " + date + " ,Local Time: "+time+" ,Local Date Time: "+dateTime);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd MMMM yyyy");
		
		System.out.println(dtf.format(date));
		 
		
		
		
		
		LocalDate dogumTarihi = LocalDate.of(1988, 9, 9);
		
		int ageYear = Period.between(dogumTarihi, date).getYears();
		
		System.out.println(ageYear);
		
	}

}
