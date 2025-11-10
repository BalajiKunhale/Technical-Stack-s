package Batch21.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		
		// current date / time
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		
		// formatted date   ( "dd-MMM-YYYY" )
		
		DateTimeFormatter Pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter Pattern1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		System.out.println(date.format(Pattern));
		System.out.println(date.format(Pattern1));
		
		
		// Manipulating dates
		
		LocalDate plusDays = date.plusDays(4);
		LocalDate plusWeeks = date.plusWeeks(6);
		LocalDate plusMonths = date.plusMonths(5);
		LocalDate plusYears = date.plusYears(3);
		
		System.out.println("-------plus--------");
		
		System.out.println(plusDays);
		System.out.println(plusWeeks);
		System.out.println(plusMonths);
		System.out.println(plusYears);
		
		System.out.println("-------minus------");
		
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(4));
		System.out.println(date.minusWeeks(5));
		System.out.println(date.minusYears(6));
		
		
		
		// Working Period
		System.out.println("-------Periods------");
		LocalDate startDate = LocalDate.of(2022,10,5);
		LocalDate endDate = LocalDate.of(2025, 1, 14);
		
		Period between = Period.between(startDate, endDate);
		System.out.println("Years : " +between.getYears());
		System.out.println("Moths : " +between.getMonths());
		System.out.println("Days :  " +between.getDays());
		
		
		//  Working with ZoneDateTime
		System.out.println("----------Zonal Date Time----------");
		ZonedDateTime americaDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime indiaDateTime  = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(americaDateTime);
        System.out.println(indiaDateTime);
	}

}
