package game;

import game.Concrete.CampaignManager;
import game.Concrete.SellingManager;
import game.Concrete.UserManager;
import game.Entities.Campaign;
import game.Entities.Selling;
import game.Entities.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------User Ýþlemleri----------------------------");
		User user1 = new User(1,"Nergiz","Erdaðý","123456","06.01.2000");
		User user2 = new User(2,"Samed","Yýlmaz","123479","30.03.2000");
		UserManager userManager = new UserManager();
		userManager.signUp(user1);
		userManager.signIn(user2);
		
		
		UserManager userManager2 = new UserManager();
		userManager2.CheckIfRealPerson(user1);
		System.out.println(" ");
		System.out.println("---------------------Bilgi güncelleme-----------------------------");
		
		userManager.signUpdate(user1);
		
		
		Selling game = new Selling("Counter-Strike" , 100 , 1000 , 15 , 85);
		SellingManager sellingManager = new SellingManager();
		
		System.out.println(" ");		
		System.out.println("-----------------------Ýndirim ekleme silme vs.---------------------------");
		
		Campaign campaign = new Campaign(1, "Yaz indirimi", 10, 1111111);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.CampaignAdd(campaign);
		campaignManager.CampaignDelete(campaign);
		campaignManager.CampaignUpdate(campaign);
		System.out.println(" ");
		
		System.out.println("------------------------Satýþ--------------------------");
		
		sellingManager.Sell(user1, game,campaign);

	}

}