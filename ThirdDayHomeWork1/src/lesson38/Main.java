package lesson38;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.log("Merhaba!");
	}

}
