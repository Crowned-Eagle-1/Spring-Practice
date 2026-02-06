package salman.example.ok.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salman.example.ok.Models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
