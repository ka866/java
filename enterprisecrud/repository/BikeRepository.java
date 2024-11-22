package com.xworkz.enterprisecrud.repository;

import com.xworkz.enterprisecrud.entity.Bike;

public class BikeRepository {
	
		Bike[] data=new Bike[10];
		
		
		public boolean saveData(Bike var)
		{
			for(int i=0;i<data.length;i++)
			{
				if(data[i]==null)
				{
					data[i]=var;
					System.out.println("Bike is saved");
					return true;
					
					
				}
			}
			return false;
		}
		
		public Bike[] readAll() {
			
			return data;
		}


	}


