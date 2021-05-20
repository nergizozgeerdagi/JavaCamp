package CafeShop.Business.Concretes;
import CafeShop.Business.Abstracts.ICustomerCheckService;
import CafeShop.Entities.Concretes.Customer;

public class CustomerCheckManager implements ICustomerCheckService
{
	@Override
	public boolean CheckIfRealPerson(Customer customer) 
	{
		return true;
	}
}