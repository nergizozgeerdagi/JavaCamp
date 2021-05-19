package game.Abstract;

import game.Entities.Campaign;

public abstract interface ICampaignManager 
{
	
	void CampaignAdd(Campaign campaign) ;
		
	
	void CampaignDelete(Campaign campaign); 
		
	
	void CampaignUpdate(Campaign campaign);
}