/*
 * Write a program that reads in the radius and length of a cylinder and computes the area
 * and volume using the following formulas
 * area = radius * radius * pi
 * volume = area * length
 */

import java.util.Scanner;

public class chapter2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		System.out.println("Enter a double value for the radius of the cylinder, press enter, and then enter a double value for the length of cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * PI;
		double volume = area * length;
		System.out.println("For a cylinder of radius " + radius + " and length " + length + " the area is " + area + " and volume is " + volume);

	}

}
