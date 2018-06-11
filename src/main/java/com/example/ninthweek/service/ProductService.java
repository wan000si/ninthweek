package com.example.ninthweek.service;

import com.example.ninthweek.entity.Product;
import com.example.ninthweek.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
//    Product findProductById(Long id);
//
//    List<Product> findAll();

    Product addProduct(Product product);

    int updateProduct(Long id, String name, String description, double price);

    Product findByNameLikeAndDescriptionLike(String name, String description);

}
