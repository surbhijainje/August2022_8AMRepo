package icici.loans.carloans;

public class FirstClass 
{
	
	// data properties
	int a=10,b=20,result;
	
	// behaviours
	public void add()
	{
		result =a+b;
		System.out.println("Add of A & B is : "+ result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " +  result);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
		int x = 100;
		char ch = 'q';
		
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1 = new FirstClass();
		obj1.add();
		obj1.sub();
	}

}
