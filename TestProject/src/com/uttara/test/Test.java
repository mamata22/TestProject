package com.uttara.test;

public class Test {
	public enum Dogs{
		coille,harrier,shepherd;
		public static void main(String[] args)
		{
			Dogs myDog=Dogs.shepherd;
			
			
			switch(myDog)
			{
			case coille:
				System.out.println("collie");
			
			case harrier:
				System.out.println("harrier");
			case default:
				System.out.println("retriever");//complilation error
			}
		}
	}

}
