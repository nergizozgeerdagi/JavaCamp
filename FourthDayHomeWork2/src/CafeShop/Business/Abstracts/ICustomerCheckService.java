package CafeShop.Business.Abstracts;
import CafeShop.Entities.Concretes.Customer;

public interface ICustomerCheckService 
{
	boolean CheckIfRealPerson(Customer customer);
}