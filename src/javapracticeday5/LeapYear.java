package javapracticeday5;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) {
		
		int Year;
		System.out.println("Enter the Year::");
		Scanner sc = new Scanner(System.in);
		Year = sc.nextInt();
		
		if (((Year % 4 == 0) && (Year % 100!=0)) || (Year % 400 == 0))
			System.out.println("Leap Year:");
		else
			System.out.println("It is not a Leap Year");
	}
}