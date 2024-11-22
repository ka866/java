package com.xworkz.enterprisecrud.service;

import com.xworkz.enterprisecrud.entity.Bike;
import com.xworkz.enterprisecrud.repository.BikeRepository;

public class BikeService {
		
		BikeRepository repo=new BikeRepository();
		
		
		public boolean validatesave(Bike ref)
		{
				if(ref.getBrand()!=null && ref.getBrand().length()>1)
				{
					if(ref.getNoOfWheels()>=2)
					{
						if(ref.getPrice()>5000)
						{
							System.out.println("Bike is valid");
							return repo.saveData(ref);
						}
					}
					return false;
					
				}
				
			System.err.println("Bike is not valid");
			return false;
		

	}
		public Bike[] readAll()
		{
			return repo.readAll();
		}
		
	}

