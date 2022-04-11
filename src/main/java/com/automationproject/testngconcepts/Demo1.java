package com.automationproject.testngconcepts;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test (priority = 1, groups = {"Regression"})
	public void signup() {
		System.out.println("signup successfully");
	}
	
	@Test (priority = 2, groups = {"Regression", "Sanity", "Smoke"})
	public void login() {
		System.out.println("Login done");
	}
	
	@Test (priority = 3, groups = {"Regression", "Smoke"})
	public void flightsBooking() {
		System.out.println("Flights booking done");
	}
	
	@Test (priority = 4, groups = {"Sanity"})
	public void bookingcancel() {
		System.out.println("Booking cancelled");
	}
	
	@Test (priority = 5, groups = {"Sanity"})
	public void changeBookingDates() {
		System.out.println("Changed Booking dates");
	}
	
	@Test (priority = 6, groups = {"Sanity", "Regression", "Smoke"})
	public void logOutApplication() {
		System.out.println("Logged out successfully");
	}
	
	@Test (priority = 7, groups = {"Sanity", "Regression", "Smoke"})
	public void tearDown() {
		System.out.println("Close browser");
	}

}
