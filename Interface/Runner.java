package com.xworkz.Interface;

public class Runner {
	public static void main(String[] args)
	{
		ElectronicDevice electronic=new Mobile();
		electronic.displayStatus();
		electronic.consumePower();
		ElectronicDevice electronic1=new Laptop();
		electronic1.displayStatus();
		electronic1.consumePower();
		
		CommunicationDevice communication=new Mobile();
		communication.call();
		communication.message();
		CommunicationDevice communication1=new Laptop();
		communication1.call();
		communication1.message();
	}
	
}
