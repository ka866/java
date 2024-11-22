package com.xworkz.enterprisecrud;

import com.xworkz.enterprisecrud.entity.Bike;
import com.xworkz.enterprisecrud.repository.BikeRepository;
import com.xworkz.enterprisecrud.service.BikeService;

public class BikeRunner {
	
		public static void main(String[] args) {
		    Bike  bike=new Bike("Himalaya",2,1000000,"Black");
			Bike bike1=new Bike("BMW",2,20000,"Blue");
			Bike bike2=new Bike(null,0,20000,"Black");
			
			BikeRepository repo=new BikeRepository();
			BikeService service=new BikeService();
			service.validatesave(bike);
			service.validatesave(bike1);
			service.validatesave(bike2);
			Bike[] result=service.readAll();
			for (int i = 0; i < result.length; i++) {
				if(result[i]!=null) {
				result[i].printDetails();
				
				
			}
			
		}
		}
	}


