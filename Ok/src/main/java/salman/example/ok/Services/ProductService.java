package salman.example.ok.Services;

import org.springframework.stereotype.Service;
import salman.example.ok.Models.Product;
import salman.example.ok.Repository.ProductRepo;

import java.util.List;

@Service
public class ProductService {
    ProductRepo repo;

    public ProductService(ProductRepo repo)
    {
        this.repo=repo;
    }

    public Product save(Product product)
    {
        return repo.save(product);
    }

    public List<Product> getAll()
     {
         return repo.findAll();
     }

     public Product getById(Integer id)
     {
         return repo.findById(id).orElse(null);
     }
}
