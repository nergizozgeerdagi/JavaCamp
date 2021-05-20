package CafeShop.Business.Concretes;
import CafeShop.Business.Abstracts.BaseCustomerManager;
import CafeShop.Business.Abstracts.ICustomerCheckService;
import CafeShop.DataAccess.Abstracts.ICustomerDal;
import CafeShop.Entities.Concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{
	ICustomerCheckService checkService;
	
	public StarbucksCustomerManager(ICustomerDal customerDal,ICustomerCheckService checkService) 
	{
		super(customerDal);
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) 
	{
		if(checkService.CheckIfRealPerson(customer)) 
		{
			super.save(customer);
		}
		else 
		{
			throw new ExceptionInInitializerError("Person invalid");
		}	
	}
}