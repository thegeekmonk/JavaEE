package com.hibernate.cache;

class A
{
	A()
	{
		System.out.println("A class");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B class");
	}
}
class C extends B
{
	C()
	{  
		super();
		System.out.println("C class");
	}
}



public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		C c1 = new C();
		
	}

}
