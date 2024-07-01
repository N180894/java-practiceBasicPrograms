package practice;

import java.util.Scanner;

public class leapYear11 {

	public static void main(String[] args) {
		int year;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=reader.nextInt();
		if(year%4==0 | year%400==0) {
			System.out.println("The entered year is a leap year");
		}

	}

}
