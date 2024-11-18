package com.src.TypeCasting;


class Electronics{
	public void tv()
	{
	
	System.out.println("TV is a electronic decive");
}
}

class Mobile extends Electronics
{
	public void mobileDevice()
	{
	

	System.out.println("Mobile is a electronic decive");
}
}

public class UpcastingInheritance {
	
	public static void main(String[] args)
	{
		
		Electronics electronic=new Mobile();
		electronic.tv();
		
		
		Mobile mobile=new Mobile();
		Electronics electronics=mobile;
		
		mobile.tv();
		
		
	}

}
