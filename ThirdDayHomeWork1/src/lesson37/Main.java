package lesson37;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		KrediUI krediUI = new KrediUI();
		OgretmenKrediManager ogretmenkredimanager = new OgretmenKrediManager();
		krediUI.kredihesapla(new OgretmenKrediManager());
		ogretmenkredimanager.hesapla(new OgretmenKrediManager());
		
	}

}
