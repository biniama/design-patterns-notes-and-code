package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class CalendarChallengeMain {

	public static void main(String[] args) {
		Calendar pacificCalendar = new PacificCalendar();
		pacificCalendar.createCalendar();
		pacificCalendar.print();

		Calendar easternCalendar = new EasternCalendar();
		easternCalendar.createCalendar();
		easternCalendar.print();
	}
}
