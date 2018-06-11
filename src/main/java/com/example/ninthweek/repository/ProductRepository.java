package com.example.ninthweek.repository;

import com.example.ninthweek.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product addProduct(Product product);

    @Modifying
    @Transactional
    int updateProduct(Long id, String name, String description, double price);

    Product findByNameLikeAndDescriptionLike(String name, String description);
}
