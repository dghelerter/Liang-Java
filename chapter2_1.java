/*
 * Write a program that reads a Celsius degree in a double value from the console
 * then converts it to Fahrenheit, and displays the result. The formula for conversion
 * is: fahrenheit = (9/5) * celsius + 32
 */

import java.util.Scanner;

public class chapter2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a double value for degrees Celsius: ");
		double celsius = input.nextDouble();
		double fahr = celsius * (9.0/5.0) + 32.0;
		System.out.println(celsius + " degrees Celsius is " + fahr + " in fahrenheit");
	}
}
