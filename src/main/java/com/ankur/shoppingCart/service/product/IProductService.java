package com.ankur.shoppingCart.service.product;

import com.ankur.shoppingCart.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    void updateProductById(Product product, Long id);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);




}
