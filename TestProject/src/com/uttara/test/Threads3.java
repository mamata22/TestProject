package com.uttara.test;

public class Threads3 implements Runnable  {
	
	
	
	
	
	
	
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[] args) {
		Thread t= new Thread(new Threads3());
		t.run();
		t.run();
		t.start();
	}

}
