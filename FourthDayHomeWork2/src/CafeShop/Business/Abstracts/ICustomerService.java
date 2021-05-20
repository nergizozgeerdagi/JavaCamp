package CafeShop.Business.Abstracts;
import CafeShop.Entities.Concretes.Customer;

public interface ICustomerService 
{
	void save(Customer customer);
}