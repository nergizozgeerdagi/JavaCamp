package CafeShop.Business.Concretes;
import CafeShop.Business.Abstracts.BaseCustomerManager;
import CafeShop.DataAccess.Abstracts.ICustomerDal;

public class NeroCustomerManager extends BaseCustomerManager
{
	public NeroCustomerManager(ICustomerDal customerDal) 
	{
		super(customerDal);
	}
}