package salman.example.ok.Controllers;

import org.springframework.web.bind.annotation.*;
import salman.example.ok.Models.Product;
import salman.example.ok.Services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    ProductService service;

    public ProductController(ProductService service)
    {
        this.service=service;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }


    @GetMapping
    public List<Product> getAll()
    {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return service.getById(id);
    }

}
