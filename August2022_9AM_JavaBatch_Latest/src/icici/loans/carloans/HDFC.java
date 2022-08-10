package icici.loans.carloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.withdrawl();
		h.deposit();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam withdrawl overriden in HDFC");
	}

	@Override
	public void deposit() {
		System.out.println("iam deposit overriden in HDFC");
	}

}
