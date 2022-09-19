/*
 * Write a program that reads a number in feet, converts it to meters, and displays the result
 */

import java.util.Scanner;
public class chapter2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double METERPERFOOT = 0.305;
		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meters = feet * METERPERFOOT;
		System.out.println(feet + " feet is " + meters + " meters");
		

	}

}
