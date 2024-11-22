package com.xworkz.enterprisecrud.entity;

public class Bike {
	
		private String brand;
		private int noOfWheels;
		private int price;
		private String color;
		
		public Bike(String brand, int noOfWheels, int price, String color) {
			this.brand = brand;
			this.noOfWheels = noOfWheels;
			this.price = price;
			this.color = color;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getNoOfWheels() {
			return noOfWheels;
		}
		public void setNoOfWheels(int noOfWheels) {
			this.noOfWheels = noOfWheels;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void printDetails()
		{
			System.out.println("Brand Name: "+brand);
			System.out.println("No of wheels: "+noOfWheels);
			System.out.println("Price : "+price);
			System.out.println("Color: "+color);
			
		}

	}


