package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String foodType;
	private int rating;
	private static int numTrucks = 0;
	public String uniqueId;
	private String idLet = "ftr-";

	private static int MAX_TRUCKS = 5;
	FoodTruck[] truck = new FoodTruck[MAX_TRUCKS];

	public FoodTruck() {
		getUniqueId();
	}

	public void addTruck(FoodTruck trk) {
		truck[numTrucks] = trk;
		numTrucks++; 
	}

	public String getUniqueId() {
		uniqueId = idLet + numTrucks;
		return uniqueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "FoodTruck [uniqueId=" + uniqueId + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating + "]";
	}

}