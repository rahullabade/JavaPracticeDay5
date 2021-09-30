package javapracticeday5;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for rows and column : ");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int array[][] = new int[row][column];
		int i,j;
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
			{
				System.out.println("Enter the element of Array");
				int element = scanner.nextInt();
				array[i][j] = element;
			}
		}
		for(i=0; i<row; i++)
		{
			System.out.println();
			for(j=0; j<column; j++)
		
			{
				System.out.println(" " +array[i][j]);
			}
		}
		
	}
}