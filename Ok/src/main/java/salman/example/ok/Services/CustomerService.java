package salman.example.ok.Services;

import org.springframework.stereotype.Service;
import salman.example.ok.Models.Customer;
import salman.example.ok.Models.Product;
import salman.example.ok.Repository.CustomerRepo;
import salman.example.ok.Repository.ProductRepo;

import java.util.List;

@Service
public class CustomerService {
    CustomerRepo repo;

    public CustomerService(CustomerRepo repo)
    {
        this.repo=repo;
    }

    public Customer save(Customer customer)
    {
        return repo.save(customer);
    }

    public List<Customer> getAll()
    {
        return repo.findAll();
    }

    public Customer getById(Integer id)
    {
        return repo.findById(id).orElse(null);
    }
}
