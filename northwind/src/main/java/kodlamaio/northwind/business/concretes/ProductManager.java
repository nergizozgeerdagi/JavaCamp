package kodlamaio.northwind.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService
{
	
	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) 
	{
		super();
		this.productDao = productDao;
	}

	
	@Override
	public DataResult <List<Product>> getAll() 
	{
		// TODO Auto-generated method stub
		return new SuccessDataResult <List<Product>>(this.productDao.findAll(),"Data listelendi.");
	
		
	}
}
