package com.uttara.test;

public class Thread {
	
	Runnable r= new Runnable()
			{
		public void run()
		{
			
			System.out.println("Cat");
		}
			};
	Thread t=new Thread(r)
			{
		     public void run()
		     {
		    	 System.out.println("Dog");
		     
		     }
			};t.start();
}
	


