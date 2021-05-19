package game.Concrete;

import game.Entities.Campaign;
import game.Entities.Selling;
import game.Entities.User;

public class SellingManager extends CampaignManager 
{
	
	public void Sell(User user , Selling game , Campaign campaign) 
	{
		
		System.out.println(" " + user.getFirstName() + " isimli kullanýcý " + game.getGameName() + " ismindeki oyunu " + campaign.getName() + " isimli kampanya ile yüzde " + campaign.getPrice() + " indirim oranýyla " + game.getGamePriceAfterDiscount() + " TL fiyatýyla aldý." );
	}
}
