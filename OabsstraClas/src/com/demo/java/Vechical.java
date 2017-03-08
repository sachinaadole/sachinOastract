/**
 * 
 */
package com.demo.java;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public abstract class Vechical 
{
	public abstract void  m1();
	public Vechical(int a, int b) 
	{
	
	}
	public Vechical(int x, int y,int z) 
	{
	
	}
	public void car()
	{
		System.out.println("this main abstract class........... ");
		
	}
	public static void  m4() 
	{
		System.out.println("this static field");
		
	}
	
}
class bike extends Vechical
{
	public void  m1() 
	{
		System.out.println("this class inside bike");
	}

	bike(int a, int b) 
	{
		super(a, b);
		int x;
		x=a+b;
		System.out.println("addition is="+x);	
	}
	 public void show()
	 {
		 System.out.println(" this is method of bike class ");
	 }
	
	
}
