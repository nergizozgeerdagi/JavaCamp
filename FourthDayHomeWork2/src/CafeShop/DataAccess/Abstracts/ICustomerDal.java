package CafeShop.DataAccess.Abstracts;
import CafeShop.Entities.Concretes.Customer;

public interface ICustomerDal 
{
	void save(Customer customer);
}