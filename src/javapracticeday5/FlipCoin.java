package javapracticeday5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int x = 0,y = 0;
		for (int i = 0; i <= number; i++) {
			Random r = new Random();
			int n = r.nextInt(2);
			if (n < 1) {
				x++;
			}
			else {
				y++;
			}
		}
			double p;
			double total = x + y;
			if (x > y) {
				p = (float)((x / total)*100);
				System.out.println("Heads win");
				System.out.println("Heads win by" + p + "percentage");
				}
			else
			{
				p = (float)((y / total)*100);
				System.out.println("Tail win");
				System.out.println("Tail win by" + p + "percentage");
			}
	}

}
