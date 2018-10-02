package com.stack.jspdemo.service;

import org.springframework.stereotype.Component;

import com.stack.jspdemo.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    public static List<Product> products = new ArrayList<>();

    private static int userCount = 3;

    static {
        products.add(new Product(1, "tuerca","modelo1", "20,20"));
        products.add(new Product(2, "tornillo","modelo2", "40,20"));
        products.add(new Product(3, "destornillador","modelo3", "90,20"));
    }

    public List<Product> findAll() {

        return products;
    }

    public Product save(Product product) {
        if (product.getId() == null) {

            product.setId(++userCount);
        }
        products.add(product);
        return product;
    }
}
