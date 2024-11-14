package com.src.Encapsulation;

public class VehicleRunner {
	
	    public static void main(String[] args) {
	        // Creating two Vehicle objects
	        Vehicle vehicle1 = new Vehicle("Tesla","Model S",2022,"Black",75.0,670,100.0,3.2,5,"Automatic",true,0,79999,"1234ABCD","Insured","JohnDoe","123 Main St",1234567890L,"johndoe@example.com","EV1234");
	        Vehicle vehicle2 = new Vehicle("Toyota","Camry",2020,"Blue",2.5,203,15.8, 25.0,5,"Automatic",false, 20000, 23999,"5678EFGH","NotInsured","JaneSmith","456 Elm St",9876543210L,"janesmith@example.com","CA5678");

	        // Display basic information for both vehicles
	        vehicle1.displayBasicInfo();
	        vehicle1.setColor("blue");
	        System.out.println(vehicle1.getColor());
	        vehicle2.setPrice(0);
	        System.out.println(vehicle2.getPrice());
	        
	        /*System.out.println("Range: " + vehicle1.calculateRange() + " miles");
	        System.out.println("Is insured: " + vehicle1.isInsured());

	        vehicle2.displayBasicInfo();
	        System.out.println("Range: " + vehicle2.calculateRange() + " miles");
	        System.out.println("Is insured: " + vehicle2.isInsured());*/
	        
	    }
	}



