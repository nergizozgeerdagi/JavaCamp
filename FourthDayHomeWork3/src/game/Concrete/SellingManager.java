package game.Concrete;

import game.Entities.Campaign;
import game.Entities.Selling;
import game.Entities.User;

public class SellingManager extends CampaignManager 
{
	
	public void Sell(User user , Selling game , Campaign campaign) 
	{
		
		System.out.println(" " + user.getFirstName() + " isimli kullan�c� " + game.getGameName() + " ismindeki oyunu " + campaign.getName() + " isimli kampanya ile y�zde " + campaign.getPrice() + " indirim oran�yla " + game.getGamePriceAfterDiscount() + " TL fiyat�yla ald�." );
	}
}
