package com.uttara.test;

public class BuilStuff {

	public static void main(String[] args) {
		Boolean test=new Boolean(true);
			Integer x=343;
			Integer y=new BuilStuff().go(test,x);
			
			System.out.println(y);

	}
	int go(Boolean b,int i)
	{
		if(b)
			return(i/7);
		return (i/49);
	}

}
