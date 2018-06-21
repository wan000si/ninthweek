package com.example.ninthweek.service.ServiceImpl;

import com.example.ninthweek.entity.Inventory;
import com.example.ninthweek.entity.Product;
import com.example.ninthweek.repository.ProductRepository;
import com.example.ninthweek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        product.setInventory(new Inventory());
        return productRepository.saveAndFlush(product);
    }

    @Override
    public int updateProduct(Long id, String name, String description, double price) {
        return productRepository.updateProduct(id, name, description, price);
    }

    @Override
    public Product findByNameLikeAndDescriptionLike(String name, String description) {
        return productRepository.findByNameLikeAndDescriptionLike(name, description);
    }
}
