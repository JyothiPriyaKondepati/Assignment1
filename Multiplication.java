/* Write a program called TimeTable to produce the multiplication table of 1 to 9 as shown using
two nested for-loops:*/

import java.io.*;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + " \t ");
			}

			System.out.println("\t \n ");

		}

	}

}
