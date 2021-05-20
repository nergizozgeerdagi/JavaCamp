package CafeShop;

import CafeShop.Business.Abstracts.BaseCustomerManager;
import CafeShop.Business.Concretes.CustomerCheckManager;
import CafeShop.Business.Concretes.StarbucksCustomerManager;
import CafeShop.DataAccess.Concretes.HibernateCustomerDal;
import CafeShop.Entities.Concretes.Customer;

public class Main 
{

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager
				(new HibernateCustomerDal(),new CustomerCheckManager());
		customerManager.save(new Customer(1,"Nergiz","Erdaðý","16 TL","Latte"));
		
	}

}