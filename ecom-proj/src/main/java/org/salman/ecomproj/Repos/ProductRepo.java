package org.salman.ecomproj.Repos;

import org.salman.ecomproj.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
