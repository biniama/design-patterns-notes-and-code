package com.biniam.designpatterns.iterator.foobarmotoco;

import java.util.Iterator;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class ClientMain {

	public static void main(String[] args) {
		option1UsingWhileLoopWithPrintMethod();

		System.out.println("\n");

		cleanAlternativeUsingForEachWithOutIterable();
	}

	private static void cleanAlternativeUsingForEachWithOutIterable() {
		System.out.println("**** Clean Alternative Using For Each With Out Iterable ****");
		System.out.println("==== Our Cars ====");
		CarRange carRange = new CarRange();
		for(Vehicle currentVehicle: carRange.getRange()) {
			System.out.println(currentVehicle);
		}

		System.out.println("==== Our Vans ====");
		VanRange vanRange = new VanRange();
		for(Vehicle currentVehicle: vanRange.getRange()) {
			System.out.println(currentVehicle);
		}
	}

	public static void option1UsingWhileLoopWithPrintMethod() {
		System.out.println("**** Option 1 Using While Loop With Print Method ****");
		System.out.println("==== Our Cars ====");
		CarRange carRange = new CarRange();
		printIterator(carRange.iterator());

		System.out.println("==== Our Vans ====");
		VanRange vanRange = new VanRange();
		printIterator(vanRange.iterator());
	}

	private static void printIterator(Iterator iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
