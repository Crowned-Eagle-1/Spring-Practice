package salman.example.ok.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salman.example.ok.Models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>
{

}
