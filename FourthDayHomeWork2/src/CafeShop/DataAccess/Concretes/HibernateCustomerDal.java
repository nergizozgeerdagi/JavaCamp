package CafeShop.DataAccess.Concretes;
import CafeShop.DataAccess.Abstracts.ICustomerDal;
import CafeShop.Entities.Concretes.Customer;

public class HibernateCustomerDal implements ICustomerDal
{
	@Override
	public void save(Customer customer) 
	{
		System.out.println("M��teri ba�ar�yla kaydedildi: " + customer.getFirstName());
	}
}