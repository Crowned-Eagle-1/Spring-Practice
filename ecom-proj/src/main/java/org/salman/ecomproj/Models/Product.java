package org.salman.ecomproj.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal Price;
    private String category;
    private Date relaseDate;
    private Boolean available;
    private int quantity;


}
