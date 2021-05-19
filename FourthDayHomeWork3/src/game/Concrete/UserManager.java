package game.Concrete;

import game.Abstract.CheckUserManager;
import game.Entities.User;

	public class UserManager implements CheckUserManager
	{
		
		public void signUp(User user) 
		{
			
			System.out.println(user.getFirstName() + " isimli kullanýcý baþarýyla kayýt edildi.");
		
		}
		
		public void signIn(User user) 
		{
			
			System.out.println(user.getFirstName() + " isimli kullanýcý baþarýyla giriþ yaptý.");
			
		}

		public void signUpdate(User user) 
		{
			
			System.out.println(user.getFirstName() + " isimli kullanýcý baþarýyla bilgilerini güncelledi.");
			
		}

		@Override
		public void CheckIfRealPerson(User user)
		{
			if(user.getId()==1 && user.getFirstName()=="Nergiz" && user.getLastName()=="Erdaðý" && user.getNationalityId()=="123456" && user.getDayOfBirth()=="06.01.2000") 
			{
				
				System.out.println(user.getFirstName() + " isimli kiþinin doðrulamasý yapýldý.");
			}
			else 
			{
				System.out.println("Böyle bir kiþi sistemde kayýtlý deðildir.");
			}
		}
	}

