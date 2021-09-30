package javapracticeday5;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times you want to flip:");
		n = sc.nextInt();
		getValues(n);
	}
	public static void getValues(int n) {
		for(int i=0; i <n; i++)
		{
			double value = Math.floor(Math.random()*10) % 2;
			if (value < 0.5)
				System.out.println("Tails");
			else
				System.out.println("Heads");
		}
	}
}