package org.salman.ecomproj.Controllers;

import org.salman.ecomproj.Models.Product;
import org.salman.ecomproj.Services.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    ProductService service;

    public ProductController(ProductService service)
    {
        this.service=service;
    }

    @RequestMapping("/")
    public String greet()
    {
        return "hello world";
    }

    @GetMapping("/products")
    public List<Product> GetAllProducts()
    {
        return service.GetAllProducts();
    }
}
