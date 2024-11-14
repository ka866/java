package com.src.Encapsulation;

public class Vehicle {
	    // 20 private variables
	    private String make;
	    private String model;
	    private int year;
	    private String color;
	    private double engineSize;
	    private int horsePower;
	    private double fuelCapacity;
	    private double fuelEfficiency;
	    private int seatingCapacity;
	    private String transmissionType;
	    private boolean isElectric;
	    private double mileage;
	    private double price;
	    private String registrationNumber;
	    private String insuranceStatus;
	    private String ownerName;
	    private String ownerAddress;
	    private long ownerPhone;
	    private String ownerEmail;
	    private String licensePlate;

	    // Parameterized constructor
	    public Vehicle(String make, String model, int year, String color, double engineSize, int horsePower, 
	                   double fuelCapacity, double fuelEfficiency, int seatingCapacity, String transmissionType, 
	                   boolean isElectric, double mileage, double price, String registrationNumber, 
	                   String insuranceStatus, String ownerName, String ownerAddress, long ownerPhone, 
	                   String ownerEmail, String licensePlate) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	        this.engineSize = engineSize;
	        this.horsePower = horsePower;
	        this.fuelCapacity = fuelCapacity;
	        this.fuelEfficiency = fuelEfficiency;
	        this.seatingCapacity = seatingCapacity;
	        this.transmissionType = transmissionType;
	        this.isElectric = isElectric;
	        this.mileage = mileage;
	        this.price = price;
	        this.registrationNumber = registrationNumber;
	        this.insuranceStatus = insuranceStatus;
	        this.ownerName = ownerName;
	        this.ownerAddress = ownerAddress;
	        this.ownerPhone = ownerPhone;
	        this.ownerEmail = ownerEmail;
	        this.licensePlate = licensePlate;
	    }

	    // Methods
	    public void displayBasicInfo() {
	        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	    }

	    public double calculateRange() {
	        return isElectric ? fuelCapacity * 3 : fuelEfficiency * fuelCapacity;
	    }

	    public boolean isInsured() {
	        return insuranceStatus.equalsIgnoreCase("Insured");
	    }

	    // Getters and Setters
	    public String getMake() {
	        return make;
	    }
	    public void setMake(String make) {
	        this.make = make;
	    }

	    public String getModel() {
	        return model;
	    }
	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getYear() {
	        return year;
	    }
	    public void setYear(int year) {
	        this.year = year;
	    }

	    public String getColor() {
	        return color;
	    }
	    public void setColor(String color) {
	        this.color = color;
	    }

	    public double getEngineSize() {
	        return engineSize;
	    }
	    public void setEngineSize(double engineSize) {
	        this.engineSize = engineSize;
	    }

	    public int getHorsePower() {
	        return horsePower;
	    }
	    public void setHorsePower(int horsePower) {
	        this.horsePower = horsePower;
	    }

	    public double getFuelCapacity() {
	        return fuelCapacity;
	    }
	    public void setFuelCapacity(double fuelCapacity) {
	        this.fuelCapacity = fuelCapacity;
	    }

	    public double getFuelEfficiency() {
	        return fuelEfficiency;
	    }
	    public void setFuelEfficiency(double fuelEfficiency) {
	        this.fuelEfficiency = fuelEfficiency;
	    }

	    public int getSeatingCapacity() {
	        return seatingCapacity;
	    }
	    public void setSeatingCapacity(int seatingCapacity) {
	        this.seatingCapacity = seatingCapacity;
	    }

	    public String getTransmissionType() {
	        return transmissionType;
	    }
	    public void setTransmissionType(String transmissionType) {
	        this.transmissionType = transmissionType;
	    }

	    public boolean getIsElectric() {
	        return isElectric;
	    }
	    public void setIsElectric(boolean isElectric) {
	        this.isElectric = isElectric;
	    }

	    public double getMileage() {
	        return mileage;
	    }
	    public void setMileage(double mileage) {
	        this.mileage = mileage;
	    }

	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	    	if(price>0)
	    	{
	    		this.price = price;
	    	
	    	}   
	    }

	    public String getRegistrationNumber() {
	        return registrationNumber;
	    }
	    public void setRegistrationNumber(String registrationNumber) {
	        this.registrationNumber = registrationNumber;
	    }

	    public String getInsuranceStatus() {
	        return insuranceStatus;
	    }
	    public void setInsuranceStatus(String insuranceStatus) {
	        this.insuranceStatus = insuranceStatus;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }
	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public String getOwnerAddress() {
	        return ownerAddress;
	    }
	    public void setOwnerAddress(String ownerAddress) {
	        this.ownerAddress = ownerAddress;
	    }

	    public long getOwnerPhone() {
	        return ownerPhone;
	    }
	    public void setOwnerPhone(long ownerPhone) {
	        this.ownerPhone = ownerPhone;
	    }

	    public String getOwnerEmail() {
	        return ownerEmail;
	    }
	    public void setOwnerEmail(String ownerEmail) {
	        this.ownerEmail = ownerEmail;
	    }

	    public String getLicensePlate() {
	        return licensePlate;
	    }
	    public void setLicensePlate(String licensePlate) {
	        this.licensePlate = licensePlate;
	    }
	}



