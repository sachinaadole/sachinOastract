/**
 * 
 */
package com.demo.java;

public class Maruti extends Vechical 
{
	
	int a;
	public void m1()
	{
		System.out.println("this maruti class");
	}

	Maruti(int x, int y, int z)
	{
			super(x, y, z);
			long s;
			s=x*y+z;
			System.out.println("vaule of thisw equation is="+s);
	}
	public void m3() 
	{
			this.car();
			System.out.println("this mauti class inside");
	}

}
