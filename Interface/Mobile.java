package com.xworkz.Interface;


public class Mobile implements ElectronicDevice,CommunicationDevice{

	@Override
	public void displayStatus() {
		System.out.println("display the statsu ");
		
	}

	@Override
	public void consumePower() {
		System.out.println("power consumed by device ");
		
	}

	@Override
	public void call() {
		System.out.println("make a normal call ");
		
	}

	@Override
	public void message() {
		System.out.println("send a text message");
		
	}

	
}
