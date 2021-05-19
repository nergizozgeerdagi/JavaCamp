package game.Entities;

public class Campaign 
{
	
		private int id;
		private String Name;
		private int price;
		private int inStock;
		
		public Campaign(int id, String name, int price, int inStock) 
		{
			super();
			this.id = id;
			this.Name = name;
			this.price = price;
			this.inStock = inStock;
		}

		public int getId() 
		{
			return id;
		}

		public void setId(int id) 
		{
			this.id = id;
		}

		public String getName() 
		{
			return Name;
		}

		public void setName(String name) 
		{
			Name = name;
		}

		public int getPrice() 
		{
			return price;
		}

		public void setPrice(int price) 
		{
			this.price = price;
		}

		public int getInStock() 
		{
			return inStock;
		}

		public void setInStock(int inStock) 
		{
			this.inStock = inStock;
		}
}


