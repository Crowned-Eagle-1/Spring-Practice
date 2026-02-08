package org.salman.ecomproj.Services;

import org.salman.ecomproj.Repos.ProductRepo;

public class ProductService {
    ProductRepo repo;

    public ProductService(ProductRepo repo)
    {
        this.repo=repo;
    }
}
