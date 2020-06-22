package com.uttara.test;

public class Y {
	
	static void test()
	{
		try{
			String x=null;
			
			
			System.out.println(x.toString()+"");
			
		}
		finally
		{
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		
		
		try{
			test();
		}
		catch(Exception ex)
		{
			System.out.println("exception");
		}

	}

}
