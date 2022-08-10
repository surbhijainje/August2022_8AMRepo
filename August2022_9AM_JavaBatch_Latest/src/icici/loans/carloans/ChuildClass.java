package icici.loans.carloans;

public class ChuildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
		ChuildClass obj = new ChuildClass();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m2() {
		System.out.println("iam m2 overriden in ChildClass");
	}

}
