package interfaces;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
	}

}
