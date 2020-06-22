package com.uttara.test;

public class Car {
	
	private int wheelCount;
	private String vin;
	public Car(String vin)
	{
     
		
	this.vin=vin;
	this.wheelCount=4;
		
	}
	public String drive()
	{
		return "zoom-zoom";
	}
	public String getinfo()
	{
		return "VIN:"+vin+"wheels:"+wheelCount;
	}
	
	 class MeGo extends Car
	{
		public MeGo(String vin)
		{
			super(vin);
			
		}
			
	}

}
