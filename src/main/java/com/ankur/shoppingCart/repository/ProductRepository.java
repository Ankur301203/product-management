package com.ankur.shoppingCart.repository;

import com.ankur.shoppingCart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
