package icici.loans.homeloans;

import icici.loans.carloans.A;

public class C extends A
{
	public void m3()
	{
		System.out.println("iam m3 in C");
	}
	
	public void m1()
	{
		System.out.println("iam m1 in A");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		
		C c = new C();
		c.m3();
		c.m1();
		System.out.println(c.x);
		
	}

}
