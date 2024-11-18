package com.xworkz.Interface;

public class Laptop implements ElectronicDevice,CommunicationDevice {

	@Override
	public void displayStatus() {
		System.out.println("display the status");
		
	}

	@Override
	public void consumePower() {
		System.out.println(" consume power");
	}

	@Override
	public void call() {
		System.out.println("call through whats up");
		
	}

	@Override
	public void message() {
		System.out.println("send message through whats up");
		
	}

}
