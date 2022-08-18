package icici.loans.carloans;

public class B extends A
{
	public void m2()
	{
		System.out.println("iam m2 in B");
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
		
		B b = new B();
		b.m2();
		b.m1();
		System.out.println(b.x);
	}

}
