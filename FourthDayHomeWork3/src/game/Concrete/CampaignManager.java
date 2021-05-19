package game.Concrete;

import game.Abstract.ICampaignManager;
import game.Entities.Campaign;

public class CampaignManager implements ICampaignManager 
{
		@Override
		public void CampaignAdd(Campaign campaign) 
		{
			
			System.out.println("Sisteme " + campaign.getName() + " isimli kampanya ba�ar�yla eklendi.");
		}

		@Override
		public void CampaignDelete(Campaign campaign) 
		{
			
			System.out.println("Sistemden " + campaign.getName() + " isimli kampanya ba�ar�yla silindi.");
		}

		@Override
		public void CampaignUpdate(Campaign campaign) 
		{
			
			System.out.println("Sistemde bulunan " + campaign.getName() + " isimli kampanya de�erleri ba�ar�yla g�ncellendi.");
		}

}

