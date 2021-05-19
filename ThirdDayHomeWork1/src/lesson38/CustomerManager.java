package lesson38;

public class CustomerManager 
{
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger)
	{
		this.logger = logger;
	}
	
	public void add()
	{
		System.out.println("Musteri eklenmistir.");
		logger.log("Log mesajidir.");
	}
}
