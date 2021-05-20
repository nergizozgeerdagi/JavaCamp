package CafeShop.Business.Abstracts;
import CafeShop.DataAccess.Abstracts.ICustomerDal;
import CafeShop.Entities.Concretes.Customer;

public abstract class BaseCustomerManager implements ICustomerService
{
	ICustomerDal customerDal;
	
	public BaseCustomerManager(ICustomerDal customerDal) 
	{
		this.customerDal = customerDal;
	}
	
	@Override
	public void save(Customer customer) 
	{
		customerDal.save(customer);	
	}
}