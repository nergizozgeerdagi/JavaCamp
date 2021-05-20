package CommerceBackend.DataAccess.Concretes;
import java.util.ArrayList;
import java.util.List;

import CommerceBackend.DataAccess.Abstracts.UserDao;
import CommerceBackend.Entities.Concretes.Users;

public class HibernateUserDao implements UserDao {
	
	List<Users> users = new ArrayList<Users>();
	@Override
	public void add(Users user) 
	{
		System.out.println("Hibernate ile eklendi. "+ user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void update(Users user) 
	{
		System.out.println("Hibernate ile güncellendi. "+ user.getFirstName());
		
	}

	@Override
	public void delete(Users user) 
	{
		System.out.println("Hibernate ile silindi. "+ user.getFirstName());
	}

	@Override
	public Users getUsers(String email, String password) 
	{
		Users loginUsers = null;
		for(Users user:users) 
		{
			if(user.getEmail()==email && user.getPassword()==password) 
			{
				loginUsers = user;
			}
		}	
		return loginUsers;
	}

	@Override
	public boolean getEmail(String email) 
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Users> getAllUsers() 
	{
		// TODO Auto-generated method stub
		return users;
	}

	

}