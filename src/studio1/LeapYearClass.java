package studio1;

import java.util.Scanner;

public class LeapYearClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What Year Would You Like to Test?");
		int year = scan.nextInt();
		
		boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		System.out.println(year + " is a Leap Year: " + leapYear);
				

	}

}
