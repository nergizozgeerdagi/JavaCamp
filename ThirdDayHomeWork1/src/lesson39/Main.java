package lesson39;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BaseKrediManager[] kredimanagers = new BaseKrediManager[]
				{
						new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()
				};

		for(BaseKrediManager kredimanager : kredimanagers) 
				{
	        System.out.println(kredimanager.hesapla(1000));
				}
	}
}
