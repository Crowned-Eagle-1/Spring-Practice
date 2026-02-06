package salman.example.ok.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import salman.example.ok.Models.Customer;
import salman.example.ok.Services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    CustomerService service;

    public CustomerController(CustomerService service)
    {
        this.service= service;
    }

    @PostMapping
    public Customer Add(@RequestBody Customer customer)
    {
        return service.save(customer);
    }

    @GetMapping
    public List<Customer> getAll()
    {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Integer id)
    {
        return service.getById(id);
    }

}
