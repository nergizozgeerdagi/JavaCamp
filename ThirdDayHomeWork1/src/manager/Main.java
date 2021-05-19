package manager;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Employee employee = new Employee();
		CostumerManager costumerManager = new CostumerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		costumerManager.add();
		costumerManager.list();
		employeeManager.add();
		employeeManager.list();
		employeeManager.bestEmployee();
	}

}
