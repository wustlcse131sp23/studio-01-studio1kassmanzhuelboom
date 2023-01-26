package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's average two values!");
		
		System.out.println("Value 1? ");
		int n1 = scan.nextInt();
		System.out.println("Value 2? ");
		int n2 = scan.nextInt();
		
		double Average = ((double)n1 + (double)n2) / 2;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + Average + "!");

	}

}
