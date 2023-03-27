package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);
	private FoodTruck[] fleet = new FoodTruck[MAX_TRUCKS];
	private static int MAX_TRUCKS = 5;

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();

	}

	public void run() {

		System.out.println("Welcome to the Food Truck App!");
		System.out.println("Please submit and rate up to 5 Food Trucks.");
		System.out.println("Ratings: 1 = Never again, 2 = Good, 3 = Awesome");
		System.out.println();

		gatherRatings();

		useMenu();

		kb.close();
	}

	public void gatherRatings() {
		for (int i = 0; i < MAX_TRUCKS; i++) {
			System.out.println(
					"What is the name of the Food Truck you would like to rate? \nOr enter quit to proceed to the menu.");
			String name = kb.nextLine();
			if ("quit".equals(name.toLowerCase())) {
				System.out.println("Thank you for your submissions : Proceeding to menu");
				break;
			}
			System.out.println("What type of food do they serve?");
			String type = kb.nextLine();
			System.out.println("How would you rate it 1 - 3?");
			int rating = kb.nextInt();

			FoodTruck truck = new FoodTruck();
			fleet[i] = truck;
			truck.setName(name);
			truck.setFoodType(type);
			truck.setRating(rating);
			truck.addTruck(truck);
			System.out.println(truck);
			System.out.println();
			if (i == (MAX_TRUCKS - 1)) {
				System.out.println("Maximum submissions reached : Proceeding to menu");
			}
			kb.nextLine();
			
		}
	}

	public void useMenu() {
		int choice;
		boolean keepGoing = true;

		while (keepGoing) {
			printMenu();
			System.out.println("Please choose an option:");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				printList();
				break;
			case 2:
				getAverage();
				break;
			case 3:
				getHighest();
				break;
			case 4:
				keepGoing = false;
				printQuit();
				break;
			default:
				System.out.println("Invalid entry, please choose an option from the menu.");
			}
		}
	}

	public void printMenu() {
		System.out.println();
		System.out.println("***********************");
		System.out.println("***** Food Trucks *****");
		System.out.println("-----------------------");
		System.out.println(" 1. List Food Trucks  ");
		System.out.println(" 2. Average Rating     ");
		System.out.println(" 3. Highest Rated      ");
		System.out.println(" 4. Quit               ");
		System.out.println("-----------------------");
		System.out.println("***********************");
	}

	public void printList() {
		System.out.println("List of Rated Food Trucks: ");
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				break;
			} else {
				System.out.println(fleet[i]);
			}
		}
	}

	public void getAverage() {
		System.out.print("Average Food Truck Rating: ");
		double average = 0.0;
		double sum = 0.0;
		double numTrucks = 0.0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				break;
			}
			sum = sum + fleet[i].getRating();
			numTrucks++;
		}
		average = sum / numTrucks;
		System.out.println(average);
	}

	public void getHighest() {
		System.out.println("Highest Rated Food Truck: ");
		int highest = fleet[0].getRating();
		int truckCounter = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				break;
			}
			if (highest < fleet[i].getRating()) {
				highest = fleet[i].getRating();
				truckCounter = i;
			}
		}
		System.out.println(fleet[truckCounter]);
	}

	public void printQuit() {
		System.out.println("Thank you for your time! Goodbye!");
	}
}
