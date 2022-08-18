package icici.loans.carloans;

import java.util.Date;

public abstract   class A 
{
	public  int x = 100;
	public final static int y = 200;
	
	public  void m1()
	{
		x = 200;
		y=2000;
		System.out.println("iam m1 in A");
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		System.out.println("iam static Block...");
	}
	
	static
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	abstract void m5();

	public static void main(String[] args) 
	{
		A a =  new A();
		a.m1();
		A.m4();
		System.out.println(a.x);
	}

}
