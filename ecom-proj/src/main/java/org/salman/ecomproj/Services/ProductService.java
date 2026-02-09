package org.salman.ecomproj.Services;

import org.salman.ecomproj.Models.Product;
import org.salman.ecomproj.Repos.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductRepo repo;

    public ProductService(ProductRepo repo)
    {
        this.repo=repo;
    }

    public List<Product> GetAllProducts()
    {
        return repo.findAll();
    }
}
