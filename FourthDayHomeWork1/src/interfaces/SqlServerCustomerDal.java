package interfaces;

public class SqlServerCustomerDal implements CustomerDal
{

	@Override
	public void add() 
	{
		System.out.println("Sql Server basariyla eklendi.");
	}

}
