package javapracticeday5;

import java.util.Scanner;

public class HarmonicNumber {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range:");
		int number = sc.nextInt();
		double k = 0.00;
		for (int i = 1; i <= number; i++)
			k += (double)1 / i;
		{
			System.out.println(number+ "The Harmonic value = "+k);
		}
	}


}
