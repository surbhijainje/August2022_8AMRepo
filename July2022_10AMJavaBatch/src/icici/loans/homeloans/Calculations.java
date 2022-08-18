package icici.loans.homeloans;

public class Calculations 
{
	int a, b, result;
	
	public Calculations(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		result = a+b;
		System.out.println("add of A& B is : " +  result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("sub of A& B is : " +  result);
	}

	public static void main(String[] args) 
	{
		Calculations obj = new Calculations(100, 200);
		obj.add();
		obj.sub();
	}

}
