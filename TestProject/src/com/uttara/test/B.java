package com.uttara.test;

public interface B {
	
	public void bMethod();

}
interface C extends A,B{
	
	
	public void cMethod();
	
}
class D implements B{
	public void bMethod()
	{
		
	}
	
	class E extends D implements C{
		public void aMethod()
		{
			
		}
		public void bMethod()
		{
			
		}
		public void cMethod()
		{
			
		}
	}
}